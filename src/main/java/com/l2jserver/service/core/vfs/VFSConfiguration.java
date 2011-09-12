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
package com.l2jserver.service.core.vfs;

import java.net.URI;
import java.nio.file.Path;

import com.l2jserver.service.configuration.Configuration;
import com.l2jserver.service.configuration.Configuration.ConfigurationName;

/**
 * VFS service configuration
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * @see Configuration
 */
@ConfigurationName("vfs")
public interface VFSConfiguration extends Configuration {
	/**
	 * @return the VFS root {@link URI}
	 */
	@ConfigurationPropertyGetter(name = "vfs.root", defaultValue = "")
	Path getRoot();

	/**
	 * @param root
	 *            the new VFS root {@link URI}
	 */
	@ConfigurationPropertySetter(name = "vfs.root")
	void setRoot(Path root);
}