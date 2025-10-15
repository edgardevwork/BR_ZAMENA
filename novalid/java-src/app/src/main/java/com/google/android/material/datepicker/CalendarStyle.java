package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.C6765R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes4.dex */
public final class CalendarStyle {

    @NonNull
    public final CalendarItemStyle day;

    @NonNull
    public final CalendarItemStyle invalidDay;

    @NonNull
    public final Paint rangeFill;

    @NonNull
    public final CalendarItemStyle selectedDay;

    @NonNull
    public final CalendarItemStyle selectedYear;

    @NonNull
    public final CalendarItemStyle todayDay;

    @NonNull
    public final CalendarItemStyle todayYear;

    @NonNull
    public final CalendarItemStyle year;

    public CalendarStyle(@NonNull Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, C6765R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C6765R.styleable.MaterialCalendar);
        this.day = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_dayStyle, 0));
        this.invalidDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.selectedDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.todayDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C6765R.styleable.MaterialCalendar_rangeFillColor);
        this.year = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_yearStyle, 0));
        this.selectedYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.todayYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.rangeFill = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
