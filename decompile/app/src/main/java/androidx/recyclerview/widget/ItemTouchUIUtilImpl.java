package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.C3108R;

/* loaded from: classes2.dex */
public class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    public static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f, float f2, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C3108R.id.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float fValueOf = Float.valueOf(ViewCompat.getElevation(view));
                ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
                view.setTag(i2, fValueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float elevation = ViewCompat.getElevation(childAt);
                if (elevation > f) {
                    f = elevation;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(@NonNull View view) {
        int i = C3108R.id.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            ViewCompat.setElevation(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
