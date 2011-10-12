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
package com.l2jserver.service.game.admin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.l2jserver.game.net.Lineage2Client;
import com.l2jserver.game.net.packet.server.SM_HTML;
import com.l2jserver.model.id.object.CharacterID;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.service.AbstractService;
import com.l2jserver.service.game.admin.panel.AdminHomeTemplate;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * 
 */
public class AdministratorServiceImpl extends AbstractService implements
		AdministratorService {
	/**
	 * The logger
	 */
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * List of online administrators
	 */
	@SuppressWarnings("unused")
	private List<CharacterID> online;

	@Override
	public void command(Lineage2Client conn, L2Character character,
			String command, String... args) {
		log.debug("{} is opening admin control panel", character);
		conn.write(new SM_HTML(null, new AdminHomeTemplate()));
	}
}