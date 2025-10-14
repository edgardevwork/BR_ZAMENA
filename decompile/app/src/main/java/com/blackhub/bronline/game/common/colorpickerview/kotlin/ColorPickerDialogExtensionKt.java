package com.blackhub.bronline.game.common.colorpickerview.kotlin;

import android.content.Context;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorPickerDialogExtension.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m7105d2 = {"colorPickerDialog", "Lcom/blackhub/bronline/game/common/colorpickerview/ColorPickerDialog$Builder;", "Landroid/content/Context;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
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
