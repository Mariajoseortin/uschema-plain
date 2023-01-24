/**
 */
package es.um.unosql.uNoSQLSchema.impl;

import es.um.unosql.uNoSQLSchema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UNoSQLSchemaFactoryImpl extends EFactoryImpl implements UNoSQLSchemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UNoSQLSchemaFactory init() {
		try {
			UNoSQLSchemaFactory theUNoSQLSchemaFactory = (UNoSQLSchemaFactory)EPackage.Registry.INSTANCE.getEFactory(UNoSQLSchemaPackage.eNS_URI);
			if (theUNoSQLSchemaFactory != null) {
				return theUNoSQLSchemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UNoSQLSchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNoSQLSchemaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA: return createuNoSQLSchema();
			case UNoSQLSchemaPackage.ENTITY_TYPE: return createEntityType();
			case UNoSQLSchemaPackage.STRUCTURAL_VARIATION: return createStructuralVariation();
			case UNoSQLSchemaPackage.ATTRIBUTE: return createAttribute();
			case UNoSQLSchemaPackage.PLIST: return createPList();
			case UNoSQLSchemaPackage.REFERENCE: return createReference();
			case UNoSQLSchemaPackage.AGGREGATE: return createAggregate();
			case UNoSQLSchemaPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case UNoSQLSchemaPackage.NULL: return createNull();
			case UNoSQLSchemaPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case UNoSQLSchemaPackage.PMAP: return createPMap();
			case UNoSQLSchemaPackage.PSET: return createPSet();
			case UNoSQLSchemaPackage.PTUPLE: return createPTuple();
			case UNoSQLSchemaPackage.KEY: return createKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public uNoSQLSchema createuNoSQLSchema() {
		uNoSQLSchemaImpl uNoSQLSchema = new uNoSQLSchemaImpl();
		return uNoSQLSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralVariation createStructuralVariation() {
		StructuralVariationImpl structuralVariation = new StructuralVariationImpl();
		return structuralVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PList createPList() {
		PListImpl pList = new PListImpl();
		return pList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Null createNull() {
		NullImpl null_ = new NullImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PMap createPMap() {
		PMapImpl pMap = new PMapImpl();
		return pMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSet createPSet() {
		PSetImpl pSet = new PSetImpl();
		return pSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTuple createPTuple() {
		PTupleImpl pTuple = new PTupleImpl();
		return pTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UNoSQLSchemaPackage getUNoSQLSchemaPackage() {
		return (UNoSQLSchemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UNoSQLSchemaPackage getPackage() {
		return UNoSQLSchemaPackage.eINSTANCE;
	}

} //UNoSQLSchemaFactoryImpl
