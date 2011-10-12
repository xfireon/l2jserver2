/*
 * This file is part of l2jserver <l2jserver.com>.
 *
 * l2jserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.game.net.packet.server;

import org.jboss.netty.buffer.ChannelBuffer;

import com.l2jserver.game.net.Lineage2Client;
import com.l2jserver.game.net.packet.AbstractServerPacket;
import com.l2jserver.model.server.AttackHit;
import com.l2jserver.model.world.Actor;

/**
 * This packet informs the client of an attack issued
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * @see AttackHit
 */
public class SM_DIE extends AbstractServerPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x00;

	/**
	 * The attacker actor
	 */
	private final Actor actor;

	public SM_DIE(Actor actor) {
		super(OPCODE);
		this.actor = actor;
	}

	@Override
	public void write(Lineage2Client conn, ChannelBuffer buffer) {
		buffer.writeInt(actor.getID().getID());
		buffer.writeInt(0x00); // to hide away
		buffer.writeInt(0x00); // to castle
		buffer.writeInt(0x00); // to siege HQ
		buffer.writeInt(0x00); // sweepable (blue glow)
		buffer.writeInt(0x00); // to FIXED
		buffer.writeInt(0x00); // to fortress
	}
}