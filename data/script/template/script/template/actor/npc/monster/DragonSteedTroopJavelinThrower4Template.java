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
public class DragonSteedTroopJavelinThrower4Template extends MonsterNPCTemplate {
	public static final int ID = 22582;

	@Inject
	protected DragonSteedTroopJavelinThrower4Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Dragon Steed Troop Javelin Thrower";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 25.00;
		this.collisionHeight = 46.50;
		this.level = 80;
		this.sex = ActorSex.MALE;
		this.attackRange = 1100;
		this.maxHP = 56659.313636067300000;
		this.maxMP = 1674.800000000000000;
		this.hpRegeneration = 195.863712662830000;
		this.mpRegeneration = 3.000000000000000;
		this.experience = 170995;
		this.sp = 18501;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(13843);
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 0;
		this.baseAttributes = true;
		
		attributes.intelligence = 21;
		attributes.strength = 40;
		attributes.concentration = 43;
		attributes.mentality = 20;
		attributes.dexterity = 30;
		attributes.witness = 20;
		attributes.physicalAttack = 9218.40693;
		attributes.magicalAttack = 6294.97689;
		attributes.physicalDefense = 546.20000;
		attributes.magicalDefense = 599.52818;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 8;
		attributes.walkSpeed = 89.00000;
		attributes.runSpeed = 220.00000;
	}
}