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
package com.l2jserver.service;

import com.l2jserver.util.exception.L2Exception;

/**
 * Exception for an {@link Service}
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class ServiceException extends L2Exception {
	/**
	 * The Java Serialization API serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a new instance of this exception
	 */
	public ServiceException() {
		super();
	}

	/**
	 * Creates a new instance of this exception
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the root cause
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Creates a new instance of this exception
	 * 
	 * @param message
	 *            the message
	 */
	public ServiceException(String message) {
		super(message);
	}

	/**
	 * Creates a new instance of this exception
	 * 
	 * @param cause
	 *            the root cause
	 */
	public ServiceException(Throwable cause) {
		super(cause);
	}
}
