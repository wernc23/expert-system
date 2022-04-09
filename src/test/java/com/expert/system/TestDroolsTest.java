package com.expert.system;

import org.junit.Test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import static org.assertj.core.api.Assertions.assertThat;

import com.expert.system.models.Rock;

public class TestDroolsTest {

	@Test
	public void testHolesIdentified() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ksession-rule-type");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSession.insert(rock);
			kSession.fireAllRules();

			assertThat(rock.getType()).isEqualTo("Igneous");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testFossilFound() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ksession-rule-type");

			Rock rock = new Rock();
			rock.setIsFossilsIdentified(true);

			kSession.insert(rock);
			kSession.fireAllRules();

			assertThat(rock.getType()).isEqualTo("Sedimentary");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testCrystalsFound() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSession = kContainer.newKieSession("ksession-rule-type");

			Rock rock = new Rock();
			rock.setIsLayered(true);
			rock.setIsCrystalsBetweenBandsIdentified(true);

			kSession.insert(rock);
			kSession.fireAllRules();

			assertThat(rock.getType()).isEqualTo("Metamorphic");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testObsidian() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(5.2);
			rock.setGrainSize("fine");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("glassy");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Obsidian");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testPumice() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(6.0);
			rock.setGrainSize("fine");
			rock.setColor("light");
			rock.setDistinguishingCharacteristic("small bubbles");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Pumice");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testScoria() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(6.0);
			rock.setGrainSize("fine");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("large bubbles");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Scoria");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testFelsite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(5.2);
			rock.setGrainSize("mixed");
			rock.setColor("light");
			rock.setDistinguishingCharacteristic("high-silcia lava");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Felsite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testAndesite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(7.0);
			rock.setGrainSize("mixed");
			rock.setColor("medium");
			rock.setDistinguishingCharacteristic("felsite and basalt");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Andesite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testBasalt() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(6.0);
			rock.setGrainSize("mixed");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("low-silica lava");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Basalt");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testPorphyry() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(6.5);
			rock.setGrainSize("mixed");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("feldspar");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Porphyry");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testGranite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(6.5);
			rock.setGrainSize("coarse");
			rock.setColor("light");
			rock.setDistinguishingCharacteristic("amphibole");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Granite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testSyenite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(5.5);
			rock.setGrainSize("coarse");
			rock.setColor("light");
			rock.setDistinguishingCharacteristic("no quartz");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Syenite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testTonalite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(7.0);
			rock.setGrainSize("coarse");
			rock.setColor("medium");
			rock.setDistinguishingCharacteristic("plagioclase and quartz");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Tonalite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testDiorite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(7.0);
			rock.setGrainSize("coarse");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("low-calcium plagioclase");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Diorite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testGabbro() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(7.0);
			rock.setGrainSize("coarse");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("no quartz");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Gabbro");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testPeridotite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(5.6);
			rock.setGrainSize("coarse");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("dense");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Peridotite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testPyroxenite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(7.0);
			rock.setGrainSize("coarse");
			rock.setColor("dark");
			rock.setDistinguishingCharacteristic("dense");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Pyroxenite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testDunite() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			// Get the session named kseesion-rule that we defined in kmodule.xml above.
			// Also by default the session returned is always stateful.
			KieSession kSessionType = kContainer.newKieSession("ksession-rule-type");
			KieSession kSessionId = kContainer.newKieSession("ksession-rule-id");

			Rock rock = new Rock();
			rock.setIsHolesIdentified(true);
			kSessionType.insert(rock);
			kSessionType.fireAllRules();

			rock.setHardness(3.7);
			rock.setGrainSize("coarse");
			rock.setColor("green");
			rock.setDistinguishingCharacteristic("dense");
			kSessionId.insert(rock);
			kSessionId.fireAllRules();

			assertThat(rock.getRockName()).isEqualTo("Dunite");

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}