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
package script.template.actor.npc.monster;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.provider.ItemTemplateIDProvider;
import com.l2jserver.model.id.template.provider.NPCTemplateIDProvider;
import com.l2jserver.model.template.npc.MonsterNPCTemplate;
import com.l2jserver.model.world.Actor.ActorSex;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class WhiteSkullKanabion2Template extends MonsterNPCTemplate {
	public static final int ID = 22453;

	@Inject
	protected WhiteSkullKanabion2Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "White Skull Kanabion";
		this.serverSideName = false;
		this.title = "Doppler";
		this.serverSideTitle = false;
		this.collisionRadius = 12.00;
		this.collisionHeight = 30.50;
		this.level = 25;
		this.sex = ActorSex.MALE;
		this.attackRange = 80;
		this.maxHP = 460.962470000000000;
		this.maxMP = 259.200000000000000;
		this.hpRegeneration = 3.500000000000000;
		this.mpRegeneration = 1.500000000000000;
		this.experience = 1136;
		this.sp = 56;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(5285);
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 1;
		this.baseAttributes = true;
		
		attributes.intelligence = 21;
		attributes.strength = 40;
		attributes.concentration = 43;
		attributes.mentality = 20;
		attributes.dexterity = 30;
		attributes.witness = 20;
		attributes.physicalAttack = 64.83203;
		attributes.magicalAttack = 44.27187;
		attributes.physicalDefense = 101.83533;
		attributes.magicalDefense = 74.51868;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 40.00000;
		attributes.runSpeed = 160.00000;
	}
}