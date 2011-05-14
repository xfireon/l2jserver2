package com.l2jserver.game.net.packet.server;

import org.jboss.netty.buffer.ChannelBuffer;

import com.l2jserver.game.net.Lineage2Connection;
import com.l2jserver.game.net.packet.AbstractServerPacket;
import com.l2jserver.model.world.character.CharacterInventory;

/**
 * This packet send the inventory to the client
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class InventoryPacket extends AbstractServerPacket {
	/**
	 * Message OPCODE
	 */
	public static final int OPCODE = 0x11;

	// private CharacterInventory inventory;
	private boolean showWindow = false;

	public InventoryPacket(CharacterInventory inventory) {
		super(OPCODE);
		// this.inventory = inventory;
	}

	@Override
	public void write(Lineage2Connection conn, ChannelBuffer buffer) {
		buffer.writeByte((showWindow ? 0x01 : 0x00));
		buffer.writeInt(0x00); // item count
		// for (Item item : inventory) {
		// buffer.writeInt(item.getID().getID());
		// buffer.writeInt(item.getTemplateID().getID());
		// buffer.writeInt(0x00); // loc slot
		// buffer.writeLong(0x00); //count
		// buffer.writeShort(0x00); // item type2
		// buffer.writeShort(0x00); // item type3
		// buffer.writeShort(0x00); // equiped?
		// buffer.writeInt(0x00); // body part
		// buffer.writeShort(0x00); // enchant level
		// // race tickets
		// buffer.writeShort(temp.getCustomType2()); // item type4
		// buffer.writeInt(0x00); // augument
		// buffer.writeInt(temp.getMana()); // mana
		// buffer.writeInt(-9999); // time
		// buffer.writeShort(temp.getAttackElementType()); // attack element
		// type
		// buffer.writeShort(temp.getAttackElementPower()); // attack element
		// power
		// for (byte i = 0; i < 6; i++) {
		// buffer.writeShort(temp.getElementDefAttr(i)); // element def attrib
		// }
		// // Enchant Effects
		// buffer.writeShort(0x00);
		// buffer.writeShort(0x00);
		// buffer.writeShort(0x00);
		// }
		// if (_inventory.hasInventoryBlock()) {
		// buffer.writeShort(_inventory.getBlockItems().length);
		// writeC(_inventory.getBlockMode());
		// for (int i : _inventory.getBlockItems())
		// buffer.writeInt(i);
		// } else
		buffer.writeShort(0x00);
	}
}