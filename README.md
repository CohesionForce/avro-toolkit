# avro-toolkit
Tools for building Apache Avro schemas and converters from an EMF model.

This set of Eclipse plugins provides an Apache Avro schema generator from an EMF Generator Model (genmodel) file.

## Usage

Currently this project is in a developmental state. To use:

1. Load the plugins into an Eclipse Instance and view the EMF genmodel in the Package Explorer view.
2. Right-click on the genmodel file and select "Generate from Genmodel"
3. Verify that Apache Avro schemas were generated into the same project as the genmodel file
and the associated Java code for the Apache Avro interface was added to the source directory specified in the genmodel file.
