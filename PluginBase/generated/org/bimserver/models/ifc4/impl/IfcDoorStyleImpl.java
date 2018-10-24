/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc4.impl;

/******************************************************************************
 * Copyright (C) 2009-2018  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcDoorStyle;
import org.bimserver.models.ifc4.IfcDoorStyleConstructionEnum;
import org.bimserver.models.ifc4.IfcDoorStyleOperationEnum;
import org.bimserver.models.ifc4.Tristate;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcDoorStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcDoorStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcDoorStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcDoorStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcDoorStyleImpl extends IfcTypeProductImpl implements IfcDoorStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_DOOR_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnum getOperationType() {
		return (IfcDoorStyleOperationEnum) eGet(Ifc4Package.Literals.IFC_DOOR_STYLE__OPERATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcDoorStyleOperationEnum newOperationType) {
		eSet(Ifc4Package.Literals.IFC_DOOR_STYLE__OPERATION_TYPE, newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnum getConstructionType() {
		return (IfcDoorStyleConstructionEnum) eGet(Ifc4Package.Literals.IFC_DOOR_STYLE__CONSTRUCTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcDoorStyleConstructionEnum newConstructionType) {
		eSet(Ifc4Package.Literals.IFC_DOOR_STYLE__CONSTRUCTION_TYPE, newConstructionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getParameterTakesPrecedence() {
		return (Tristate) eGet(Ifc4Package.Literals.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTakesPrecedence(Tristate newParameterTakesPrecedence) {
		eSet(Ifc4Package.Literals.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE, newParameterTakesPrecedence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSizeable() {
		return (Tristate) eGet(Ifc4Package.Literals.IFC_DOOR_STYLE__SIZEABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeable(Tristate newSizeable) {
		eSet(Ifc4Package.Literals.IFC_DOOR_STYLE__SIZEABLE, newSizeable);
	}

} //IfcDoorStyleImpl
