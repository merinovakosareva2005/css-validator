// $Id$
// Author: Yves Lafon <ylafon@w3.org>
//
// (c) COPYRIGHT MIT, ERCIM and Keio University, 2012.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.css.properties.css;

import org.w3c.css.parser.CssStyle;
import org.w3c.css.properties.css1.Css1Style;
import org.w3c.css.util.ApplContext;
import org.w3c.css.util.InvalidParamException;
import org.w3c.css.values.CssExpression;
import org.w3c.css.values.CssValue;

/**
 * @since CSS1
 */
public class CssPaddingBottom extends CssProperty {

	public CssValue value;

	/**
	 * Create a new CssPaddingBottom
	 */
	public CssPaddingBottom() {
	}


	/**
	 * Set the value of the property<br/>
	 * Does not check the number of values
	 *
	 * @param expression The expression for this property
	 * @throws org.w3c.css.util.InvalidParamException
	 *          The expression is incorrect
	 */
	public CssPaddingBottom(ApplContext ac, CssExpression expression)
			throws InvalidParamException {
		this(ac, expression, false);
	}

	/**
	 * Set the value of the property
	 *
	 * @param expression The expression for this property
	 * @param check      set it to true to check the number of values
	 * @throws org.w3c.css.util.InvalidParamException
	 *          The expression is incorrect
	 */
	public CssPaddingBottom(ApplContext ac, CssExpression expression,
							boolean check) throws InvalidParamException {
		throw new InvalidParamException("unrecognize", ac);

	}


	/**
	 * Returns the value of this property
	 */
	public Object get() {
		return value;
	}


	/**
	 * Returns the name of this property
	 */
	public final String getPropertyName() {
		return "padding-bottom";
	}

	/**
	 * Returns a string representation of the object.
	 */
	public String toString() {
		return value.toString();
	}

	/**
	 * Returns true if this property is "softly" inherited
	 * e.g. his value is equals to inherit
	 */
	public boolean isSoftlyInherited() {
		return inherit == value;
	}

	/**
	 * Add this property to the CssStyle
	 *
	 * @param style The CssStyle
	 */
	public void addToStyle(ApplContext ac, CssStyle style) {
		CssPadding cssPadding = ((Css1Style) style).cssPadding;
		if (cssPadding.paddingBottom != null) {
			style.addRedefinitionWarning(ac, this);

		}
		cssPadding.paddingBottom = this;
	}

	/**
	 * Get this property in the style.
	 *
	 * @param style   The style where the property is
	 * @param resolve if true, resolve the style to find this property
	 */
	public CssProperty getPropertyInStyle(CssStyle style, boolean resolve) {
		if (resolve) {
			return ((Css1Style) style).getPaddingBottom();
		} else {
			return ((Css1Style) style).cssPadding.paddingBottom;
		}
	}

	/**
	 * Compares two properties for equality.
	 *
	 * @param property The other property.
	 */
	public boolean equals(CssProperty property) {
		try {
			CssPaddingBottom other = (CssPaddingBottom) property;
			return (value != null && value.equals(other.value)) || (value == null && other.value == null);
		} catch (ClassCastException cce) {
			return false; // FIXME
		}
	}
}
