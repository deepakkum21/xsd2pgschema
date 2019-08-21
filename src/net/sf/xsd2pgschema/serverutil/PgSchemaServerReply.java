/*
    xsd2pgschema - Database replication tool based on XML Schema
    Copyright 2018 Masashi Yokochi

    https://sourceforge.net/projects/xsd2pgschema/

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package net.sf.xsd2pgschema.serverutil;

import java.io.Serializable;

/**
 * Reply object of PgSchema server.
 *
 * @author yokochi
 */
public class PgSchemaServerReply implements Serializable {

	/** The default serial version ID. */
	private static final long serialVersionUID = 1L;

	/** The server message. */
	public String message = null;

	/** The serialized PostgreSQL data model. */
	public byte[] schema_bytes = null;

}
