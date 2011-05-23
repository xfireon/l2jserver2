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
package script.template.actor.npc.raidboss;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.provider.ItemTemplateIDProvider;
import com.l2jserver.model.id.template.provider.NPCTemplateIDProvider;
import com.l2jserver.model.template.npc.RaidBossNPCTemplate;
import com.l2jserver.model.world.Actor.ActorSex;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class Anakazel4Template extends RaidBossNPCTemplate {
	public static final int ID = 25336;

	@Inject
	protected Anakazel4Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Anakazel";
		this.serverSideName = false;
		this.title = "Invaders' Leader";
		this.serverSideTitle = false;
		this.collisionRadius = 28.00;
		this.collisionHeight = 48.00;
		this.level = 58;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 296249.601689099000000;
		this.maxMP = 977.400000000000000;
		this.hpRegeneration = 137.414906534199000;
		this.mpRegeneration = 2.400000000000000;
		this.experience = 1843815;
		this.sp = 257493;
		this.aggressive = false;
		this.rightHand = null;
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 0;
		this.baseAttributes = true;
		
		attributes.intelligence = 76;
		attributes.strength = 60;
		attributes.concentration = 57;
		attributes.mentality = 80;
		attributes.dexterity = 73;
		attributes.witness = 70;
		attributes.physicalAttack = 822.28385;
		attributes.magicalAttack = 388.65348;
		attributes.physicalDefense = 713.98287;
		attributes.magicalDefense = 348.30000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 37.00000;
		attributes.runSpeed = 190.00000;
	}
}