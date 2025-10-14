package androidx.databinding.adapters;

import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class TimePickerBindingAdapter {
    @BindingAdapter({"android:hour"})
    public static void setHour(TimePicker timePicker, int i) {
        if (timePicker.getHour() != i) {
            timePicker.setHour(i);
        }
    }

    @BindingAdapter({"android:minute"})
    public static void setMinute(TimePicker timePicker, int i) {
        if (timePicker.getMinute() != i) {
            timePicker.setMinute(i);
        }
    }

    @InverseBindingAdapter(attribute = "android:hour")
    public static int getHour(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @InverseBindingAdapter(attribute = "android:minute")
    public static int getMinute(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @BindingAdapter(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(TimePicker timePicker, final TimePicker.OnTimeChangedListener onTimeChangedListener, final InverseBindingListener inverseBindingListener, final InverseBindingListener inverseBindingListener2) {
        if (inverseBindingListener == null && inverseBindingListener2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: androidx.databinding.adapters.TimePickerBindingAdapter.1
                @Override // android.widget.TimePicker.OnTimeChangedListener
                public void onTimeChanged(TimePicker timePicker2, int i, int i2) {
                    TimePicker.OnTimeChangedListener onTimeChangedListener2 = onTimeChangedListener;
                    if (onTimeChangedListener2 != null) {
                        onTimeChangedListener2.onTimeChanged(timePicker2, i, i2);
                    }
                    InverseBindingListener inverseBindingListener3 = inverseBindingListener;
                    if (inverseBindingListener3 != null) {
                        inverseBindingListener3.onChange();
                    }
                    InverseBindingListener inverseBindingListener4 = inverseBindingListener2;
                    if (inverseBindingListener4 != null) {
                        inverseBindingListener4.onChange();
                    }
                }
            });
        }
    }
}
