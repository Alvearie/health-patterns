/*
 * (C) Copyright IBM Corp. 2021
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.healthpatterns.app;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author Luis A. García
 */
public class CQLFileTest {

	/**
	 * 
	 * @throws IOException
	 */
	@Test
	public void testLoadCQLFile() throws IOException {
		CQLFile file = new CQLFile(Paths.get("src/test/resources/test.cql"));
		assertEquals("Test", file.getName());
		assertEquals("1.0.0", file.getVersion());
	}

	/**
	 * 
	 * @throws IOException
	 */
	@Test
	public void testLoadCQLFile2() throws IOException {
		CQLFile file = new CQLFile(Paths.get("src/test/resources/CMS645_FHIR-2.0.0.cql"));
		assertEquals("CMS645_FHIR", file.getName());
		assertEquals("2.0.0", file.getVersion());
	}

}
