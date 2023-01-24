/**
 */
package es.um.unosql.uNoSQLSchema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.unosql.uNoSQLSchema.PTuple#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see es.um.unosql.uNoSQLSchema.UNoSQLSchemaPackage#getPTuple()
 * @model
 * @generated
 */
public interface PTuple extends DataType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.unosql.uNoSQLSchema.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see es.um.unosql.uNoSQLSchema.UNoSQLSchemaPackage#getPTuple_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataType> getElements();

} // PTuple
