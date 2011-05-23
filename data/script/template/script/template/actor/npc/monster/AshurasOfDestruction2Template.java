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
public class AshurasOfDestruction2Template extends MonsterNPCTemplate {
	public static final int ID = 21656;

	@Inject
	protected AshurasOfDestruction2Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Ashuras of Destruction";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 17.00;
		this.collisionHeight = 49.00;
		this.level = 78;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 3077.157205800000000;
		this.maxMP = 1848.240000000000000;
		this.hpRegeneration = 8.874000000000000;
		this.mpRegeneration = 3.131400000000000;
		this.experience = 62781;
		this.sp = 7385;
		this.aggressive = false;
		this.rightHand = null;
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
		attributes.physicalAttack = 1009.39500;
		attributes.magicalAttack = 719.59956;
		attributes.physicalDefense = 373.96949;
		attributes.magicalDefense = 261.02228;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 41.00000;
		attributes.runSpeed = 190.00000;
	}
}