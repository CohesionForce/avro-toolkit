/*
 * generated by Xtext 2.19.0
 */
package com.cohesionforce.avro


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AvroSchemaStandaloneSetup extends AvroSchemaStandaloneSetupGenerated {

	def static void doSetup() {
		new AvroSchemaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
