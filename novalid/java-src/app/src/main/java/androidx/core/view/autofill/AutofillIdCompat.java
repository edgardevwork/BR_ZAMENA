package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.platform.coreshims.AutofillIdCompat$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public class AutofillIdCompat {
    public final Object mWrappedObj;

    @RequiresApi(26)
    public AutofillIdCompat(@NonNull AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return AutofillIdCompat$$ExternalSyntheticApiModelOutline0.m298m(this.mWrappedObj);
    }
}
