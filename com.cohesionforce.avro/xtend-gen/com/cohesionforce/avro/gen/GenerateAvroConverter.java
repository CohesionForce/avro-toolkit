package com.cohesionforce.avro.gen;

import com.cohesionforce.avro.gen.FileGenerator;
import com.cohesionforce.avro.gen.Utility;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateAvroConverter {
  public void generateConverter(final EPackage anEPackage, final FileGenerator fsa) {
    try {
      String basePackage = Utility.getBasePackage();
      String avroPrefix = basePackage.concat(".avro.");
      String emfPrefix = basePackage.concat(".");
      String emfFactory = emfPrefix.concat(Utility.getFactory());
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("package ");
      _builder.append(basePackage);
      _builder.append(".avro;");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.util.ArrayList;");
      _builder.newLine();
      _builder.append("import java.util.Date;");
      _builder.newLine();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("import java.util.Locale;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.text.ParseException;");
      _builder.newLine();
      _builder.append("import java.text.SimpleDateFormat;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import com.cohesionforce.avro.AvroEMFConverter;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.apache.avro.Schema;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.EObject;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.InternalEObject;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.EClass;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.EClassifier;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.EPackage;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.ecore.util.EcoreUtil;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.common.util.EList;");
      _builder.newLine();
      _builder.append("import org.eclipse.emf.common.util.URI;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// Main class definition");
      _builder.newLine();
      _builder.append("public class ConvertEMFtoAvro implements AvroEMFConverter {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public Schema getSchema() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<Schema> schemaList = new ArrayList<Schema>();");
      _builder.newLine();
      {
        Iterable<EClass> _filter = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
        for(final EClass eclass : _filter) {
          _builder.append("\t");
          _builder.append("schemaList.add(");
          String _concat = avroPrefix.concat(eclass.getName());
          _builder.append(_concat, "\t");
          _builder.append(".SCHEMA$);");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("Schema unionSchema = Schema.createUnion(schemaList);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return unionSchema;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public Object convertEObject(EObject eobject) {");
      _builder.newLine();
      {
        Iterable<EClass> _filter_1 = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
        for(final EClass eclass_1 : _filter_1) {
          _builder.append("\t");
          _builder.append("if(eobject instanceof ");
          String _concat_1 = emfPrefix.concat(eclass_1.getName());
          _builder.append(_concat_1, "\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return convert");
          String _name = eclass_1.getName();
          _builder.append(_name, "\t\t");
          _builder.append("((");
          String _concat_2 = emfPrefix.concat(eclass_1.getName());
          _builder.append(_concat_2, "\t\t");
          _builder.append(")eobject);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public Schema getSchema(EObject eobject) {");
      _builder.newLine();
      {
        Iterable<EClass> _filter_2 = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
        for(final EClass eclass_2 : _filter_2) {
          _builder.append("\t");
          _builder.append("if(eobject instanceof ");
          String _concat_3 = emfPrefix.concat(eclass_2.getName());
          _builder.append(_concat_3, "\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return ");
          String _concat_4 = avroPrefix.concat(eclass_2.getName());
          _builder.append(_concat_4, "\t\t");
          _builder.append(".getClassSchema();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        Iterable<EClass> _filter_3 = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
        for(final EClass eclass_3 : _filter_3) {
          _builder.append("public ");
          String _concat_5 = avroPrefix.concat(eclass_3.getName());
          _builder.append(_concat_5);
          _builder.append(" convert");
          String _name_1 = eclass_3.getName();
          _builder.append(_name_1);
          _builder.append("(");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _concat_6 = emfPrefix.concat(eclass_3.getName());
          _builder.append(_concat_6, "\t");
          _builder.append(" input) {");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// If the input is null, then return null ");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("if(input == null)");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return null;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          String _concat_7 = avroPrefix.concat(eclass_3.getName());
          _builder.append(_concat_7, "\t");
          _builder.append(" output = new ");
          String _concat_8 = avroPrefix.concat(eclass_3.getName());
          _builder.append(_concat_8, "\t");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          {
            EList<EStructuralFeature> _eAllStructuralFeatures = eclass_3.getEAllStructuralFeatures();
            for(final EStructuralFeature aFeature : _eAllStructuralFeatures) {
              {
                boolean _equalsIgnoreCase = aFeature.getEType().getName().equalsIgnoreCase("EFeatureMapEntry");
                boolean _not = (!_equalsIgnoreCase);
                if (_not) {
                  {
                    int _upperBound = aFeature.getUpperBound();
                    boolean _notEquals = (_upperBound != 1);
                    if (_notEquals) {
                      _builder.append("// Handle array of non-containment references");
                      _builder.newLine();
                      {
                        if (((aFeature instanceof EReference) && (!((EReference) aFeature).isContainment()))) {
                          _builder.append("List<CharSequence> ");
                          String _name_2 = aFeature.getName();
                          _builder.append(_name_2);
                          _builder.append("List = new ArrayList<CharSequence>();");
                          _builder.newLineIfNotEmpty();
                          _builder.append("for(");
                          String _concat_9 = emfPrefix.concat(aFeature.getEType().getName());
                          _builder.append(_concat_9);
                          _builder.append(" itr : input.get");
                          String _firstUpper = StringExtensions.toFirstUpper(aFeature.getName());
                          _builder.append(_firstUpper);
                          _builder.append("()) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("String uri = getURI(itr);");
                          _builder.newLine();
                          _builder.append("\t");
                          String _name_3 = aFeature.getName();
                          _builder.append(_name_3, "\t");
                          _builder.append("List.add(uri);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("if(");
                          String _name_4 = aFeature.getName();
                          _builder.append(_name_4);
                          _builder.append("List.size() > 0)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("{");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("output.set");
                          String _firstUpper_1 = StringExtensions.toFirstUpper(aFeature.getName());
                          _builder.append(_firstUpper_1, "\t");
                          _builder.append("(");
                          String _name_5 = aFeature.getName();
                          _builder.append(_name_5, "\t");
                          _builder.append("List);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("} else {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("output.set");
                          String _firstUpper_2 = StringExtensions.toFirstUpper(aFeature.getName());
                          _builder.append(_firstUpper_2, "\t");
                          _builder.append("(null);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("// Now handle normal array");
                          _builder.newLine();
                        } else {
                          _builder.append("List<");
                          String _concat_10 = avroPrefix.concat(aFeature.getEType().getName());
                          _builder.append(_concat_10);
                          _builder.append("> ");
                          String _name_6 = aFeature.getName();
                          _builder.append(_name_6);
                          _builder.append("List = new ArrayList<");
                          String _concat_11 = avroPrefix.concat(aFeature.getEType().getName());
                          _builder.append(_concat_11);
                          _builder.append(">();");
                          _builder.newLineIfNotEmpty();
                          _builder.append("for(");
                          String _concat_12 = emfPrefix.concat(aFeature.getEType().getName());
                          _builder.append(_concat_12);
                          _builder.append(" itr : input.get");
                          String _firstUpper_3 = StringExtensions.toFirstUpper(aFeature.getName());
                          _builder.append(_firstUpper_3);
                          _builder.append("()) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          String _name_7 = aFeature.getName();
                          _builder.append(_name_7, "\t");
                          _builder.append("List.add(convert");
                          String _name_8 = aFeature.getEType().getName();
                          _builder.append(_name_8, "\t");
                          _builder.append("(itr));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("if(");
                          String _name_9 = aFeature.getName();
                          _builder.append(_name_9);
                          _builder.append("List.size() > 0)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("{");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("output.set");
                          String _firstUpper_4 = StringExtensions.toFirstUpper(aFeature.getName());
                          _builder.append(_firstUpper_4, "\t");
                          _builder.append("(");
                          String _name_10 = aFeature.getName();
                          _builder.append(_name_10, "\t");
                          _builder.append("List);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("} else {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("output.set");
                          String _firstUpper_5 = StringExtensions.toFirstUpper(aFeature.getName());
                          _builder.append(_firstUpper_5, "\t");
                          _builder.append("(null);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("}");
                          _builder.newLine();
                        }
                      }
                    } else {
                      if ((aFeature instanceof EAttribute)) {
                        {
                          EClassifier _eType = ((EAttribute)aFeature).getEType();
                          if ((_eType instanceof EEnum)) {
                            _builder.append("if(input.get");
                            String _firstUpper_6 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                            _builder.append(_firstUpper_6);
                            _builder.append("() != null) {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("output.set");
                            String _firstUpper_7 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                            _builder.append(_firstUpper_7, "\t");
                            _builder.append("(");
                            String _concat_13 = avroPrefix.concat(((EAttribute)aFeature).getEType().getName());
                            _builder.append(_concat_13, "\t");
                            _builder.append(".valueOf(input.get");
                            String _firstUpper_8 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                            _builder.append(_firstUpper_8, "\t");
                            _builder.append("().getLiteral()));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            boolean _equalsIgnoreCase_1 = ((EAttribute)aFeature).getEType().getName().equalsIgnoreCase("EBoolean");
                            if (_equalsIgnoreCase_1) {
                              _builder.append("output.set");
                              String _firstUpper_9 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                              _builder.append(_firstUpper_9);
                              _builder.append("(input.is");
                              String _firstUpper_10 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                              _builder.append(_firstUpper_10);
                              _builder.append("());");
                              _builder.newLineIfNotEmpty();
                            } else {
                              boolean _equalsIgnoreCase_2 = ((EAttribute)aFeature).getEType().getName().equalsIgnoreCase("EDate");
                              if (_equalsIgnoreCase_2) {
                                _builder.append("if(input.get");
                                String _firstUpper_11 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                                _builder.append(_firstUpper_11);
                                _builder.append("() != null) {");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("output.set");
                                String _firstUpper_12 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                                _builder.append(_firstUpper_12, "\t");
                                _builder.append("(input.get");
                                String _firstUpper_13 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                                _builder.append(_firstUpper_13, "\t");
                                _builder.append("().toString());");
                                _builder.newLineIfNotEmpty();
                                _builder.append("}");
                                _builder.newLine();
                              } else {
                                _builder.append("output.set");
                                String _firstUpper_14 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                                _builder.append(_firstUpper_14);
                                _builder.append("(input.get");
                                String _firstUpper_15 = StringExtensions.toFirstUpper(((EAttribute)aFeature).getName());
                                _builder.append(_firstUpper_15);
                                _builder.append("());");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      } else {
                        _builder.append("// Handle non-containment references");
                        _builder.newLine();
                        {
                          if (((aFeature instanceof EReference) && (!((EReference) aFeature).isContainment()))) {
                            _builder.append("if(input.get");
                            String _firstUpper_16 = StringExtensions.toFirstUpper(aFeature.getName());
                            _builder.append(_firstUpper_16);
                            _builder.append("() != null)");
                            _builder.newLineIfNotEmpty();
                            _builder.append("{");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("String uri = getURI(input.get");
                            String _firstUpper_17 = StringExtensions.toFirstUpper(aFeature.getName());
                            _builder.append(_firstUpper_17, "\t");
                            _builder.append("());");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("output.set");
                            String _firstUpper_18 = StringExtensions.toFirstUpper(aFeature.getName());
                            _builder.append(_firstUpper_18, "\t");
                            _builder.append("(uri);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            _builder.append("output.set");
                            String _firstUpper_19 = StringExtensions.toFirstUpper(aFeature.getName());
                            _builder.append(_firstUpper_19);
                            _builder.append("(convert");
                            String _name_11 = aFeature.getEType().getName();
                            _builder.append(_name_11);
                            _builder.append("(input.get");
                            String _firstUpper_20 = StringExtensions.toFirstUpper(aFeature.getName());
                            _builder.append(_firstUpper_20);
                            _builder.append("()));");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
              _builder.newLine();
            }
          }
          _builder.newLine();
          _builder.append("\t");
          _builder.append("return output;");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("public EObject convertAvroObject(Object object) {");
      _builder.newLine();
      {
        Iterable<EClass> _filter_4 = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
        for(final EClass eclass_4 : _filter_4) {
          {
            boolean _isAbstract = eclass_4.isAbstract();
            boolean _not_1 = (!_isAbstract);
            if (_not_1) {
              _builder.append("if(object instanceof ");
              String _concat_14 = avroPrefix.concat(eclass_4.getName());
              _builder.append(_concat_14);
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("{");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("return convert");
              String _name_12 = eclass_4.getName();
              _builder.append(_name_12, "\t");
              _builder.append("((");
              String _concat_15 = avroPrefix.concat(eclass_4.getName());
              _builder.append(_concat_15, "\t");
              _builder.append(")object);");
              _builder.newLineIfNotEmpty();
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        Iterable<EClass> _filter_5 = Iterables.<EClass>filter(anEPackage.getEClassifiers(), EClass.class);
        for(final EClass eclass_5 : _filter_5) {
          {
            boolean _isAbstract_1 = eclass_5.isAbstract();
            boolean _not_2 = (!_isAbstract_1);
            if (_not_2) {
              _builder.append("public ");
              String _concat_16 = emfPrefix.concat(eclass_5.getName());
              _builder.append(_concat_16);
              _builder.append(" convert");
              String _name_13 = eclass_5.getName();
              _builder.append(_name_13);
              _builder.append("(");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              String _concat_17 = avroPrefix.concat(eclass_5.getName());
              _builder.append(_concat_17, "\t");
              _builder.append(" input) {");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              _builder.append("\t");
              String _concat_18 = emfPrefix.concat(eclass_5.getName());
              _builder.append(_concat_18, "\t");
              _builder.append(" output = ");
              _builder.append(emfFactory, "\t");
              _builder.append(".eINSTANCE.create");
              String _name_14 = eclass_5.getName();
              _builder.append(_name_14, "\t");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
              {
                EList<EStructuralFeature> _eAllStructuralFeatures_1 = eclass_5.getEAllStructuralFeatures();
                for(final EStructuralFeature aFeature_1 : _eAllStructuralFeatures_1) {
                  {
                    boolean _equalsIgnoreCase_3 = aFeature_1.getEType().getName().equalsIgnoreCase("EFeatureMapEntry");
                    boolean _not_3 = (!_equalsIgnoreCase_3);
                    if (_not_3) {
                      _builder.append("if(input.get");
                      String _firstUpper_21 = StringExtensions.toFirstUpper(aFeature_1.getName());
                      _builder.append(_firstUpper_21);
                      _builder.append("() != null) {");
                      _builder.newLineIfNotEmpty();
                      {
                        int _upperBound_1 = aFeature_1.getUpperBound();
                        boolean _notEquals_1 = (_upperBound_1 != 1);
                        if (_notEquals_1) {
                          {
                            if (((aFeature_1 instanceof EReference) && (!((EReference) aFeature_1).isContainment()))) {
                              _builder.append("EList<");
                              String _concat_19 = emfPrefix.concat(aFeature_1.getEType().getName());
                              _builder.append(_concat_19);
                              _builder.append("> ");
                              String _name_15 = aFeature_1.getName();
                              _builder.append(_name_15);
                              _builder.append("List = output.get");
                              String _firstUpper_22 = StringExtensions.toFirstUpper(aFeature_1.getName());
                              _builder.append(_firstUpper_22);
                              _builder.append("();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("for(CharSequence itr : input.get");
                              String _firstUpper_23 = StringExtensions.toFirstUpper(aFeature_1.getName());
                              _builder.append(_firstUpper_23);
                              _builder.append("()) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              String _concat_20 = emfPrefix.concat(aFeature_1.getEType().getName());
                              _builder.append(_concat_20, "\t");
                              _builder.append(" ");
                              String _name_16 = aFeature_1.getName();
                              _builder.append(_name_16, "\t");
                              _builder.append("Proxy = ");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("(");
                              String _concat_21 = emfPrefix.concat(aFeature_1.getEType().getName());
                              _builder.append(_concat_21, "\t\t");
                              _builder.append(")getEObject(itr.toString());");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              String _name_17 = aFeature_1.getName();
                              _builder.append(_name_17, "\t");
                              _builder.append("List.add(");
                              String _name_18 = aFeature_1.getName();
                              _builder.append(_name_18, "\t");
                              _builder.append("Proxy);");
                              _builder.newLineIfNotEmpty();
                              _builder.append("}");
                              _builder.newLine();
                            } else {
                              _builder.append("EList<");
                              String _concat_22 = emfPrefix.concat(aFeature_1.getEType().getName());
                              _builder.append(_concat_22);
                              _builder.append("> ");
                              String _name_19 = aFeature_1.getName();
                              _builder.append(_name_19);
                              _builder.append("List = output.get");
                              String _firstUpper_24 = StringExtensions.toFirstUpper(aFeature_1.getName());
                              _builder.append(_firstUpper_24);
                              _builder.append("();");
                              _builder.newLineIfNotEmpty();
                              _builder.append("for(");
                              String _concat_23 = avroPrefix.concat(aFeature_1.getEType().getName());
                              _builder.append(_concat_23);
                              _builder.append(" itr : input.get");
                              String _firstUpper_25 = StringExtensions.toFirstUpper(aFeature_1.getName());
                              _builder.append(_firstUpper_25);
                              _builder.append("()) {");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              String _name_20 = aFeature_1.getName();
                              _builder.append(_name_20, "\t");
                              _builder.append("List.add((");
                              String _concat_24 = emfPrefix.concat(aFeature_1.getEType().getName());
                              _builder.append(_concat_24, "\t");
                              _builder.append(")convertAvroObject(itr));");
                              _builder.newLineIfNotEmpty();
                              _builder.append("}");
                              _builder.newLine();
                            }
                          }
                        } else {
                          if ((aFeature_1 instanceof EAttribute)) {
                            {
                              EClassifier _eType_1 = ((EAttribute)aFeature_1).getEType();
                              if ((_eType_1 instanceof EEnum)) {
                                _builder.append("output.set");
                                String _firstUpper_26 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                _builder.append(_firstUpper_26);
                                _builder.append("(");
                                String _concat_25 = emfPrefix.concat(((EAttribute)aFeature_1).getEType().getName());
                                _builder.append(_concat_25);
                                _builder.append(".get(input.get");
                                String _firstUpper_27 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                _builder.append(_firstUpper_27);
                                _builder.append("().name()));");
                                _builder.newLineIfNotEmpty();
                              } else {
                                boolean _equalsIgnoreCase_4 = ((EAttribute)aFeature_1).getEType().getName().equalsIgnoreCase("EBoolean");
                                if (_equalsIgnoreCase_4) {
                                  _builder.append("output.set");
                                  String _firstUpper_28 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                  _builder.append(_firstUpper_28);
                                  _builder.append("(input.get");
                                  String _firstUpper_29 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                  _builder.append(_firstUpper_29);
                                  _builder.append("());");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  boolean _equalsIgnoreCase_5 = ((EAttribute)aFeature_1).getEType().getName().equalsIgnoreCase("EDate");
                                  if (_equalsIgnoreCase_5) {
                                    _builder.append("try {");
                                    _builder.newLine();
                                    _builder.append("\t");
                                    _builder.append("Date ");
                                    String _name_21 = ((EAttribute)aFeature_1).getName();
                                    _builder.append(_name_21, "\t");
                                    _builder.append("Date = new SimpleDateFormat(\"MMMM d, yyyy\", Locale.ENGLISH).parse(input.get");
                                    String _firstUpper_30 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                    _builder.append(_firstUpper_30, "\t");
                                    _builder.append("().toString());");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t");
                                    _builder.append("output.set");
                                    String _firstUpper_31 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                    _builder.append(_firstUpper_31, "\t");
                                    _builder.append("(");
                                    String _name_22 = ((EAttribute)aFeature_1).getName();
                                    _builder.append(_name_22, "\t");
                                    _builder.append("Date);");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("} catch(ParseException e) {");
                                    _builder.newLine();
                                    _builder.append("\t");
                                    _builder.append("// TODO Auto-generated catch block");
                                    _builder.newLine();
                                    _builder.append("\t");
                                    _builder.append("e.printStackTrace();");
                                    _builder.newLine();
                                    _builder.append("}");
                                    _builder.newLine();
                                  } else {
                                    boolean _equalsIgnoreCase_6 = ((EAttribute)aFeature_1).getEType().getName().equalsIgnoreCase("EString");
                                    if (_equalsIgnoreCase_6) {
                                      _builder.append("output.set");
                                      String _firstUpper_32 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                      _builder.append(_firstUpper_32);
                                      _builder.append("(input.get");
                                      String _firstUpper_33 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                      _builder.append(_firstUpper_33);
                                      _builder.append("().toString());");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      _builder.append("output.set");
                                      String _firstUpper_34 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                      _builder.append(_firstUpper_34);
                                      _builder.append("(input.get");
                                      String _firstUpper_35 = StringExtensions.toFirstUpper(((EAttribute)aFeature_1).getName());
                                      _builder.append(_firstUpper_35);
                                      _builder.append("());");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            _builder.append("// Handle non-containment references");
                            _builder.newLine();
                            {
                              if (((aFeature_1 instanceof EReference) && (!((EReference) aFeature_1).isContainment()))) {
                                String _concat_26 = emfPrefix.concat(aFeature_1.getEType().getName());
                                _builder.append(_concat_26);
                                _builder.append(" ");
                                String _name_23 = aFeature_1.getName();
                                _builder.append(_name_23);
                                _builder.append("Proxy = ");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("(");
                                String _concat_27 = emfPrefix.concat(aFeature_1.getEType().getName());
                                _builder.append(_concat_27, "\t");
                                _builder.append(")getEObject(input.get");
                                String _firstUpper_36 = StringExtensions.toFirstUpper(aFeature_1.getName());
                                _builder.append(_firstUpper_36, "\t");
                                _builder.append("().toString());");
                                _builder.newLineIfNotEmpty();
                                _builder.append("output.set");
                                String _firstUpper_37 = StringExtensions.toFirstUpper(aFeature_1.getName());
                                _builder.append(_firstUpper_37);
                                _builder.append("(");
                                String _name_24 = aFeature_1.getName();
                                _builder.append(_name_24);
                                _builder.append("Proxy);");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("output.set");
                                String _firstUpper_38 = StringExtensions.toFirstUpper(aFeature_1.getName());
                                _builder.append(_firstUpper_38);
                                _builder.append("(convert");
                                String _name_25 = aFeature_1.getEType().getName();
                                _builder.append(_name_25);
                                _builder.append("(input.get");
                                String _firstUpper_39 = StringExtensions.toFirstUpper(aFeature_1.getName());
                                _builder.append(_firstUpper_39);
                                _builder.append("()));");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                      _builder.append("}");
                      _builder.newLine();
                    }
                  }
                }
              }
              _builder.newLine();
              _builder.append("\t");
              _builder.append("return output;");
              _builder.newLine();
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private EObject getEObject(String input) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("EObject rvalue = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("String");
      _builder.append("[", "\t\t");
      _builder.append("]", "\t\t");
      _builder.append(" pieces = input.split(\" \");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("if (pieces.length == 3) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("String ns = pieces");
      _builder.append("[", "\t\t\t");
      _builder.append("0");
      _builder.append("]", "\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("String className = pieces");
      _builder.append("[", "\t\t\t");
      _builder.append("1");
      _builder.append("]", "\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("String fragment = pieces");
      _builder.append("[", "\t\t\t");
      _builder.append("2");
      _builder.append("]", "\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(ns);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (pkg != null) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("EClassifier classifier = pkg.getEClassifier(className);");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if (classifier instanceof EClass) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("InternalEObject eobject = (InternalEObject) EcoreUtil");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append(".create((EClass) classifier);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("URI uri = URI.createURI(fragment);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("eobject.eSetProxyURI(uri);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("rvalue = eobject;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return rvalue;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private StringBuilder builder = new StringBuilder();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private String getURI(EObject eobject) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if(eobject.eResource() == null)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("throw new NullPointerException(\"child object not contained in a resource\");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("builder.setLength(0);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("builder.append(eobject.eClass().getEPackage().getNsURI());");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("builder.append(\" \");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("builder.append(eobject.eClass().getName());");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("builder.append(\" \");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("builder.append(EcoreUtil.getURI(eobject));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return builder.toString();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      fsa.generateFile("ConvertEMFtoAvro.java", _builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
