package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class TableLayoutBindingAdapter {
    public static final int MAX_COLUMNS = 20;
    public static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    @BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) throws NumberFormatException {
        SparseBooleanArray columns = parseColumns(charSequence);
        for (int i = 0; i < 20; i++) {
            boolean z = columns.get(i, false);
            if (z != tableLayout.isColumnCollapsed(i)) {
                tableLayout.setColumnCollapsed(i, z);
            }
        }
    }

    @BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) throws NumberFormatException {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = columns.keyAt(i);
            boolean zValueAt = columns.valueAt(i);
            if (zValueAt) {
                tableLayout.setColumnShrinkable(iKeyAt, zValueAt);
            }
        }
    }

    @BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) throws NumberFormatException {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = columns.keyAt(i);
            boolean zValueAt = columns.valueAt(i);
            if (zValueAt) {
                tableLayout.setColumnStretchable(iKeyAt, zValueAt);
            }
        }
    }

    public static SparseBooleanArray parseColumns(CharSequence charSequence) throws NumberFormatException {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : sColumnPattern.split(charSequence)) {
            try {
                int i = Integer.parseInt(str);
                if (i >= 0) {
                    sparseBooleanArray.put(i, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }
}
