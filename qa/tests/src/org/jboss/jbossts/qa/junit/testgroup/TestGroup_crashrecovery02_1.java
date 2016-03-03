/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 *
 * (C) 2009,
 * @author JBoss Inc.
 */
package org.jboss.jbossts.qa.junit.testgroup;

import org.jboss.jbossts.qa.junit.*;
import org.junit.*;

// Automatically generated by XML2JUnit
public class TestGroup_crashrecovery02_1 extends TestGroupBase
{
	public String getTestGroupName()
	{
		return "crashrecovery02_1";
	}

	protected Task server0 = null;

	@Before public void setUp()
	{
		super.setUp();
		server0 = createTask("server0", com.arjuna.ats.arjuna.recovery.RecoveryManager.class, Task.TaskType.EXPECT_READY, 480);
		server0.start("-test");
	}

	@After public void tearDown()
	{
		try {
			server0.terminate();
		Task task0 = createTask("task0", org.jboss.jbossts.qa.Utils.RemoveServerIORStore.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		task0.perform("$(1)", "$(2)", "$(3)");
		} finally {
			super.tearDown();
		}
	}

	@Test public void CrashRecovery02_1_Test01()
	{
		setTestName("Test01");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.CrashRecovery02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480, "server");
		server1.start("$(3)", "$(1)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client01b.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client0.start("$(1)");
		client0.waitFor();
		server1.terminate();
		Task server2 = createTask("server2", org.jboss.jbossts.qa.CrashRecovery02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480, "server");
		server2.start("$(3)", "$(2)");
		Task client1 = createTask("client1", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client01a.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client1.start("$(2)");
		client1.waitFor();
		server2.terminate();
	}

	@Test public void CrashRecovery02_1_Test02()
	{
		setTestName("Test02");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.CrashRecovery02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480, "server");
		server1.start("$(3)", "$(1)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client02b.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client0.start("$(1)");
		client0.waitFor();
		server1.terminate();
		Task server2 = createTask("server2", org.jboss.jbossts.qa.CrashRecovery02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480, "server");
		server2.start("$(3)", "$(2)");
		Task client1 = createTask("client1", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client02a.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client1.start("$(2)");
		client1.waitFor();
		server2.terminate();
	}

    @Test public void CrashRecovery02_1_Test03()
	{
		setTestName("Test03");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.CrashRecovery02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480, "server");
		server1.start("$(3)", "$(1)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client03b.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client0.start("$(1)");
		client0.waitFor();
		server1.terminate();
		Task server2 = createTask("server2", org.jboss.jbossts.qa.CrashRecovery02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480, "server");
		server2.start("$(3)", "$(2)");
		Task client1 = createTask("client1", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client03a.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client1.start("$(2)");
		client1.waitFor();
		server2.terminate();
	}

    @Test public void CrashRecovery02_1_Test04()
	{
		setTestName("Test04");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.CrashRecovery02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480, "server");
		server1.start("$(3)", "$(1)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client04b.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client0.start("$(1)");
		client0.waitFor();
		server1.terminate();
		Task server2 = createTask("server2", org.jboss.jbossts.qa.CrashRecovery02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480, "server");
		server2.start("$(3)", "$(2)");
		Task client1 = createTask("client1", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client04a.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client1.start("$(2)");
		client1.waitFor();
		server2.terminate();
	}

    @Test public void CrashRecovery02_1_Test05()
	{
		setTestName("Test05");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.CrashRecovery02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480, "server");
		server1.start("$(3)", "$(1)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client05b.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client0.start("$(1)");
		client0.waitFor();
		server1.terminate();
		Task server2 = createTask("server2", org.jboss.jbossts.qa.CrashRecovery02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480, "server");
		server2.start("$(3)", "$(2)");
		Task client1 = createTask("client1", org.jboss.jbossts.qa.CrashRecovery02Clients1.Client05a.class, Task.TaskType.EXPECT_PASS_FAIL, 480, "client");
		client1.start("$(2)");
		client1.waitFor();
		server2.terminate();
	}

}
