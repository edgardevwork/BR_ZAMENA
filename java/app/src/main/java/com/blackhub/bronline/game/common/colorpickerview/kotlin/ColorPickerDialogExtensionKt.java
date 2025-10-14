package com.blackhub.bronline.game.common.colorpickerview.kotlin;

import android.content.Context;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorPickerDialogExtension.kt */
/* loaded from: classes.dex */
public final class ColorPickerDialogExtensionKt {
    @ColorPickerDsl
    public static final /* synthetic */ ColorPickerDialog.Builder colorPickerDialog(Context context, Function1<? super ColorPickerDialog.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ColorPickerDialog.Builder builder = new ColorPickerDialog.Builder(context);
        block.invoke(builder);
        return builder;
    }
}

