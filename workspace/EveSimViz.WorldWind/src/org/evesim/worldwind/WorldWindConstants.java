package org.evesim.worldwind;

import gov.nasa.worldwind.render.AnnotationAttributes;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Point;

public class WorldWindConstants {

	public final static Color COL_COMP_BACK = new Color(0f, 0f, 0f, .5f);
	
	public final static Color COL_OK = Color.GREEN;
	public final static Color COL_NOK = Color.RED;
	public final static Color COL_RECOVER = Color.YELLOW;

	public final static AnnotationAttributes ATTRIBUTES_DEFAULT;
	public final static AnnotationAttributes ATTRIBUTES_SELECTED;

	public final static AnnotationAttributes ATTRIBUTES_MON_OK_DEFAULT;
	public final static AnnotationAttributes ATTRIBUTES_MON_OK_SELECTED;
	public final static AnnotationAttributes ATTRIBUTES_MON_RECOVER_DEFAULT;
	public final static AnnotationAttributes ATTRIBUTES_MON_RECOVER_SELECTED;
	public final static AnnotationAttributes ATTRIBUTES_MON_NOK_DEFAULT;
	public final static AnnotationAttributes ATTRIBUTES_MON_NOK_SELECTED;

	static {
		ATTRIBUTES_DEFAULT = new AnnotationAttributes();
		ATTRIBUTES_DEFAULT.setCornerRadius(10);
		ATTRIBUTES_DEFAULT.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_DEFAULT.setBackgroundColor(COL_COMP_BACK);
		ATTRIBUTES_DEFAULT.setTextColor(Color.WHITE);
		ATTRIBUTES_DEFAULT.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_DEFAULT.setDistanceMinScale(.5);
		ATTRIBUTES_DEFAULT.setDistanceMaxScale(2);
		ATTRIBUTES_DEFAULT.setDistanceMinOpacity(.5);
		ATTRIBUTES_DEFAULT.setLeaderGapWidth(14);
		ATTRIBUTES_DEFAULT.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_DEFAULT.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_DEFAULT.setBorderColor(Color.GRAY);
		ATTRIBUTES_DEFAULT.setBorderWidth(1);

		ATTRIBUTES_SELECTED = new AnnotationAttributes();
		ATTRIBUTES_SELECTED.setCornerRadius(10);
		ATTRIBUTES_SELECTED.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_SELECTED.setBackgroundColor(COL_COMP_BACK);
		ATTRIBUTES_SELECTED.setTextColor(Color.WHITE);
		ATTRIBUTES_SELECTED.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_SELECTED.setDistanceMinScale(.5);
		ATTRIBUTES_SELECTED.setDistanceMaxScale(2);
		ATTRIBUTES_SELECTED.setDistanceMinOpacity(.5);
		ATTRIBUTES_SELECTED.setLeaderGapWidth(14);
		ATTRIBUTES_SELECTED.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_SELECTED.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_SELECTED.setBorderColor(Color.RED);
		ATTRIBUTES_SELECTED.setBorderWidth(1);

		ATTRIBUTES_MON_OK_DEFAULT = new AnnotationAttributes();
		ATTRIBUTES_MON_OK_DEFAULT.setCornerRadius(10);
		ATTRIBUTES_MON_OK_DEFAULT.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_MON_OK_DEFAULT.setBackgroundColor(Color.GREEN);
		ATTRIBUTES_MON_OK_DEFAULT.setTextColor(Color.WHITE);
		ATTRIBUTES_MON_OK_DEFAULT.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_MON_OK_DEFAULT.setDistanceMinScale(.5);
		ATTRIBUTES_MON_OK_DEFAULT.setDistanceMaxScale(2);
		ATTRIBUTES_MON_OK_DEFAULT.setDistanceMinOpacity(.5);
		ATTRIBUTES_MON_OK_DEFAULT.setLeaderGapWidth(14);
		ATTRIBUTES_MON_OK_DEFAULT.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_MON_OK_DEFAULT.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_MON_OK_DEFAULT.setBorderColor(Color.GRAY);
		ATTRIBUTES_MON_OK_DEFAULT.setBorderWidth(0);

		ATTRIBUTES_MON_OK_SELECTED = new AnnotationAttributes();
		ATTRIBUTES_MON_OK_SELECTED.setCornerRadius(10);
		ATTRIBUTES_MON_OK_SELECTED.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_MON_OK_SELECTED.setBackgroundColor(Color.GREEN);
		ATTRIBUTES_MON_OK_SELECTED.setTextColor(Color.WHITE);
		ATTRIBUTES_MON_OK_SELECTED.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_MON_OK_SELECTED.setDistanceMinScale(.5);
		ATTRIBUTES_MON_OK_SELECTED.setDistanceMaxScale(2);
		ATTRIBUTES_MON_OK_SELECTED.setDistanceMinOpacity(.5);
		ATTRIBUTES_MON_OK_SELECTED.setLeaderGapWidth(14);
		ATTRIBUTES_MON_OK_SELECTED.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_MON_OK_SELECTED.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_MON_OK_SELECTED.setBorderColor(Color.WHITE);
		ATTRIBUTES_MON_OK_SELECTED.setBorderWidth(2);

		ATTRIBUTES_MON_NOK_DEFAULT = new AnnotationAttributes();
		ATTRIBUTES_MON_NOK_DEFAULT.setCornerRadius(10);
		ATTRIBUTES_MON_NOK_DEFAULT.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_MON_NOK_DEFAULT.setBackgroundColor(COL_NOK);
		ATTRIBUTES_MON_NOK_DEFAULT.setTextColor(Color.WHITE);
		ATTRIBUTES_MON_NOK_DEFAULT.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_MON_NOK_DEFAULT.setDistanceMinScale(.5);
		ATTRIBUTES_MON_NOK_DEFAULT.setDistanceMaxScale(2);
		ATTRIBUTES_MON_NOK_DEFAULT.setDistanceMinOpacity(.5);
		ATTRIBUTES_MON_NOK_DEFAULT.setLeaderGapWidth(14);
		ATTRIBUTES_MON_NOK_DEFAULT.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_MON_NOK_DEFAULT.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_MON_NOK_DEFAULT.setBorderColor(Color.GRAY);
		ATTRIBUTES_MON_NOK_DEFAULT.setBorderWidth(0);

		ATTRIBUTES_MON_NOK_SELECTED = new AnnotationAttributes();
		ATTRIBUTES_MON_NOK_SELECTED.setCornerRadius(10);
		ATTRIBUTES_MON_NOK_SELECTED.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_MON_NOK_SELECTED.setBackgroundColor(COL_NOK);
		ATTRIBUTES_MON_NOK_SELECTED.setTextColor(Color.WHITE);
		ATTRIBUTES_MON_NOK_SELECTED.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_MON_NOK_SELECTED.setDistanceMinScale(.5);
		ATTRIBUTES_MON_NOK_SELECTED.setDistanceMaxScale(2);
		ATTRIBUTES_MON_NOK_SELECTED.setDistanceMinOpacity(.5);
		ATTRIBUTES_MON_NOK_SELECTED.setLeaderGapWidth(14);
		ATTRIBUTES_MON_NOK_SELECTED.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_MON_NOK_SELECTED.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_MON_NOK_SELECTED.setBorderColor(Color.WHITE);
		ATTRIBUTES_MON_NOK_SELECTED.setBorderWidth(2);

		ATTRIBUTES_MON_RECOVER_DEFAULT = new AnnotationAttributes();
		ATTRIBUTES_MON_RECOVER_DEFAULT.setCornerRadius(10);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_MON_RECOVER_DEFAULT.setBackgroundColor(COL_RECOVER);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setTextColor(Color.BLACK);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_MON_RECOVER_DEFAULT.setDistanceMinScale(.5);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setDistanceMaxScale(2);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setDistanceMinOpacity(.5);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setLeaderGapWidth(14);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_MON_RECOVER_DEFAULT.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_MON_RECOVER_DEFAULT.setBorderColor(Color.GRAY);
		ATTRIBUTES_MON_RECOVER_DEFAULT.setBorderWidth(0);

		ATTRIBUTES_MON_RECOVER_SELECTED = new AnnotationAttributes();
		ATTRIBUTES_MON_RECOVER_SELECTED.setCornerRadius(10);
		ATTRIBUTES_MON_RECOVER_SELECTED.setInsets(new Insets(8, 8, 8, 8));
		ATTRIBUTES_MON_RECOVER_SELECTED.setBackgroundColor(COL_RECOVER);
		ATTRIBUTES_MON_RECOVER_SELECTED.setTextColor(Color.BLACK);
		ATTRIBUTES_MON_RECOVER_SELECTED.setDrawOffset(new Point(25, 25));
		ATTRIBUTES_MON_RECOVER_SELECTED.setDistanceMinScale(.5);
		ATTRIBUTES_MON_RECOVER_SELECTED.setDistanceMaxScale(2);
		ATTRIBUTES_MON_RECOVER_SELECTED.setDistanceMinOpacity(.5);
		ATTRIBUTES_MON_RECOVER_SELECTED.setLeaderGapWidth(14);
		ATTRIBUTES_MON_RECOVER_SELECTED.setDrawOffset(new Point(20, 40));
		ATTRIBUTES_MON_RECOVER_SELECTED.setInsets(new Insets(6, 28, 6, 6));
		ATTRIBUTES_MON_RECOVER_SELECTED.setBorderColor(Color.WHITE);
		ATTRIBUTES_MON_RECOVER_SELECTED.setBorderWidth(2);

	}
}
