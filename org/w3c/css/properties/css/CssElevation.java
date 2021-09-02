//
// $Id$
// From Philippe Le Hegaret (Philippe.Le_Hegaret@sophia.inria.fr)
//
// (c) COPYRIGHT MIT and INRIA, 1997.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.css.properties.css;

import org.w3c.css.parser.CssStyle;
import org.w3c.css.properties.css2.Css2Style;
import org.w3c.css.util.ApplContext;
import org.w3c.css.util.InvalidParamException;
import org.w3c.css.values.CssExpression;
import org.w3c.css.values.CssValue;


/**
 * @since CSS2
 */
public class CssElevation extends CssProperty {

    /**
     * Create a new CssElevation
     */
    public CssElevation() {
    }

    /**
     * Creates a new ACssElevation
     *
     * @param expression The expression for this property
     * @throws org.w3c.css.util.InvalidParamException
     *          Values are incorrect
     */
    public CssElevation(ApplContext ac, CssExpression expression,
                        boolean check) throws InvalidParamException {
        throw new InvalidParamException("unrecognize", ac);
    }

    public CssElevation(ApplContext ac, CssExpression expression)
            throws InvalidParamException {
        this(ac, expression, false);
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
        return "elevation";
    }

    /**
     * Returns true if this property is "softly" inherited
     * e.g. his value is equals to inherit
     */
    public boolean isSoftlyInherited() {
        return value.equals(inherit);
    }

    /**
     * Returns a string representation of the object.
     */
    public String toString() {
        return value.toString();
    }

    /**
     * Add this property to the CssStyle.
     *
     * @param style The CssStyle
     */
    public void addToStyle(ApplContext ac, CssStyle style) {
        if (((Css2Style) style).cssElevation != null)
            style.addRedefinitionWarning(ac, this);
        ((Css2Style) style).cssElevation = this;
    }

    /**
     * Compares two properties for equality.
     *
     * @param property The other property.
     */
    public boolean equals(CssProperty property) {
        return (property instanceof CssElevation &&
                value.equals(((CssElevation) property).value));
    }

    /**
     * Get this property in the style.
     *
     * @param style   The style where the property is
     * @param resolve if true, resolve the style to find this property
     */
    public CssProperty getPropertyInStyle(CssStyle style, boolean resolve) {
        if (resolve) {
            return ((Css2Style) style).getElevation();
        } else {
            return ((Css2Style) style).cssElevation;
        }
    }
}

