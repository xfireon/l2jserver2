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
package com.l2jserver.db.dao;

import java.util.List;

import com.l2jserver.model.id.ID;
import com.l2jserver.model.id.object.NPCID;
import com.l2jserver.model.id.template.NPCTemplateID;
import com.l2jserver.model.world.NPC;
import com.l2jserver.service.cache.Cacheable;
import com.l2jserver.service.cache.IgnoreCaching;
import com.l2jserver.service.database.DataAccessObject;

/**
 * The {@link NPCDAO} is can load and save {@link NPC NPC instances}.
 * 
 * @author Rogiel
 */
public interface NPCDAO extends DataAccessObject<NPC>, Cacheable {
	/**
	 * Load the instance represented by <tt>id</tt> from the database
	 * 
	 * @param id
	 *            the id
	 * @return the instance loaded
	 */
	NPC load(NPCID id);

	/**
	 * Load all {@link NPC} instances
	 * 
	 * @return all NPC instances
	 */
	List<NPC> loadAll();

	/**
	 * Select an {@link NPC} by its template.
	 * 
	 * @param name
	 *            the npc template id
	 * @return the found NPC. Null if does not exists.
	 */
	List<NPC> selectByTemplate(NPCTemplateID templateID);

	/**
	 * Loads an List of all {@link ID}s in the database
	 * 
	 * @return the list containing all ids
	 */
	@IgnoreCaching
	List<NPCID> listIDs();

	/**
	 * Save the instance to the database. If a new database entry was created
	 * returns true.
	 * 
	 * @param npc
	 *            the npc
	 * @return true if created a new entry in database (i.e. insert), false if
	 *         not created (i.e. update)
	 */
	@IgnoreCaching
	boolean save(NPC npc);

	/**
	 * Save the instance to the database. If a new database entry was created
	 * returns true.
	 * 
	 * @param npc
	 *            the npc
	 */
	@IgnoreCaching
	void insert(NPC npc);

	/**
	 * Updates the instance to the database.
	 * 
	 * @param npc
	 *            the npc
	 */
	@IgnoreCaching
	void update(NPC npc);
}
