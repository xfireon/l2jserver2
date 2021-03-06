/*
 * This file is part of l2jserver2 <l2jserver2.com>.
 *
 * l2jserver2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver2.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.game.net.packet.server;

import org.jboss.netty.buffer.ChannelBuffer;

import com.l2jserver.model.template.NPCTemplate;
import com.l2jserver.model.world.NPC;
import com.l2jserver.service.network.model.Lineage2Client;
import com.l2jserver.service.network.model.ProtocolVersion;
import com.l2jserver.service.network.model.packet.AbstractServerPacket;
import com.l2jserver.util.BufferUtils;

/**
 * This packet sends to the client an actor information about an actor
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class SM_NPC_INFO extends AbstractServerPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x16;
	/**
	 * The {@link NPC}
	 */
	private final NPC npc;

	/**
	 * @param npc
	 *            the npc
	 */
	public SM_NPC_INFO(NPC npc) {
		super(OPCODE);
		this.npc = npc;
	}

	@Override
	public void write(Lineage2Client conn, ChannelBuffer buffer) {
		final NPCTemplate template = npc.getTemplate();

		buffer.writeInt(npc.getID().getID());
		buffer.writeInt(template.getID().getID() + 1000000); // npctype
																// id
		// buffer.writeInt((template.isAttackable() ? 0x01 : 0x00)); //
		// attackable
		// FIXME unhard code it
		buffer.writeInt(0x00); // attackable
		buffer.writeInt(npc.getPoint().getX());
		buffer.writeInt(npc.getPoint().getY());
		buffer.writeInt(npc.getPoint().getZ());
		buffer.writeInt((int) npc.getPoint().getAngle());
		buffer.writeInt(0x00); // unk
		buffer.writeInt(npc.getStats().getMagicalAttackSpeed());
		buffer.writeInt(npc.getStats().getPhysicalAttackSpeed());
		buffer.writeInt(npc.getStats().getRunSpeed());
		buffer.writeInt(npc.getStats().getWalkSpeed());
		buffer.writeInt(npc.getStats().getRunSpeed()); // swim run speed
		buffer.writeInt(npc.getStats().getWalkSpeed()); // swim walk speed
		buffer.writeInt(npc.getStats().getRunSpeed()); // swim run speed
		buffer.writeInt(npc.getStats().getWalkSpeed()); // swim walk speed
		buffer.writeInt(npc.getStats().getRunSpeed()); // fly run speed
		buffer.writeInt(npc.getStats().getWalkSpeed()); // fly run speed
		buffer.writeDouble(0x01); // TODO multiplier?
		buffer.writeDouble(0x01);// TODO multiplier?
		buffer.writeDouble(template.getInfo().getCollision().getRadius());
		buffer.writeDouble(template.getInfo().getCollision().getHeigth());
		if (template.getInfo().getItem() != null) {
			buffer.writeInt((template.getInfo().getItem().getRightHand() != null ? template
					.getInfo().getItem().getRightHand().getID()
					: 0x00));
		} else {
			buffer.writeInt(0x00);
		}
		buffer.writeInt(0x00); // chest
		if (template.getInfo().getItem() != null) {
			buffer.writeInt((template.getInfo().getItem().getLeftHand() != null ? template
					.getInfo().getItem().getLeftHand().getID()
					: 0x00));
		} else {
			buffer.writeInt(0x00);
		}
		buffer.writeByte(1); // name above char 1=true ... ??
		buffer.writeByte(0x01); // is running
		buffer.writeByte((npc.isAttacking() ? 0x01 : 0x00)); // is in combat
		buffer.writeByte((npc.isDead() ? 0x01 : 0x00)); // is like dead (faking)
		buffer.writeByte(0x00); // 0=teleported 1=default 2=summoned
		BufferUtils.writeString(buffer,
				(template.getInfo().getName() != null ? template.getInfo()
						.getName().getValue() : null));
		BufferUtils.writeString(buffer,
				(template.getInfo().getTitle() != null ? template.getInfo()
						.getTitle().getValue() : null));
		buffer.writeInt(0x00); // Title color 0=client default, 1 for summons
		buffer.writeInt(0x00); // pvp flag TODO
		buffer.writeInt(0x00); // karma TODO

		buffer.writeInt(0x00); // C2 - abnormal effect TODO
		buffer.writeInt(0x00); // clan id
		buffer.writeInt(0x00); // crest id
		buffer.writeInt(0x00); // ally id
		buffer.writeInt(0x00); // all crest
		buffer.writeByte(0x00); // C2 - is flying

		buffer.writeByte(0x00); // title color 0=client OR circle 1-blue, 2-red?
		buffer.writeDouble(template.getInfo().getCollision().getRadius());
		buffer.writeDouble(template.getInfo().getCollision().getHeigth());
		buffer.writeInt(0x00); // C4 - enchant effect
		buffer.writeInt(0x00); // C6 -- is flying

		if (conn.supports(ProtocolVersion.FREYA)) {
			buffer.writeInt(0x00); // unk
			buffer.writeInt(0x00);// CT1.5 Pet form and skills, Color effect
			buffer.writeByte((template.getInfo().getName() != null
					&& template.getInfo().getName().isDisplay() ? 0x01 : 0x00)); // hide
			// name
			buffer.writeByte((template.getInfo().getName() != null
					&& template.getInfo().getName().isDisplay() ? 0x01 : 0x00)); // hide
			// name,
			// again

			buffer.writeInt(0x00); // special effects
			buffer.writeInt(0x00); // display effect
		}
	}
}
