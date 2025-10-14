package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextField.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m7105d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1164:1\n116#2,2:1165\n33#2,6:1167\n118#2:1173\n116#2,2:1174\n33#2,6:1176\n118#2:1182\n116#2,2:1183\n33#2,6:1185\n118#2:1191\n116#2,2:1192\n33#2,6:1194\n118#2:1200\n116#2,2:1201\n33#2,6:1203\n118#2:1209\n116#2,2:1210\n33#2,6:1212\n118#2:1218\n544#2,2:1219\n33#2,6:1221\n546#2:1227\n116#2,2:1228\n33#2,6:1230\n118#2:1236\n544#2,2:1237\n33#2,6:1239\n546#2:1245\n544#2,2:1246\n33#2,6:1248\n546#2:1254\n116#2,2:1255\n33#2,6:1257\n118#2:1263\n116#2,2:1264\n33#2,6:1266\n118#2:1272\n116#2,2:1273\n33#2,6:1275\n118#2:1281\n116#2,2:1282\n33#2,6:1284\n118#2:1290\n116#2,2:1291\n33#2,6:1293\n118#2:1299\n116#2,2:1300\n33#2,6:1302\n118#2:1308\n116#2,2:1309\n33#2,6:1311\n118#2:1317\n116#2,2:1318\n33#2,6:1320\n118#2:1326\n116#2,2:1327\n33#2,6:1329\n118#2:1335\n116#2,2:1336\n33#2,6:1338\n118#2:1344\n116#2,2:1345\n33#2,6:1347\n118#2:1353\n544#2,2:1354\n33#2,6:1356\n546#2:1362\n116#2,2:1363\n33#2,6:1365\n118#2:1371\n116#2,2:1372\n33#2,6:1374\n118#2:1380\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n653#1:1165,2\n653#1:1167,6\n653#1:1173\n658#1:1174,2\n658#1:1176,6\n658#1:1182\n664#1:1183,2\n664#1:1185,6\n664#1:1191\n670#1:1192,2\n670#1:1194,6\n670#1:1200\n682#1:1201,2\n682#1:1203,6\n682#1:1209\n686#1:1210,2\n686#1:1212,6\n686#1:1218\n699#1:1219,2\n699#1:1221,6\n699#1:1227\n705#1:1228,2\n705#1:1230,6\n705#1:1236\n747#1:1237,2\n747#1:1239,6\n747#1:1245\n838#1:1246,2\n838#1:1248,6\n838#1:1254\n839#1:1255,2\n839#1:1257,6\n839#1:1263\n842#1:1264,2\n842#1:1266,6\n842#1:1272\n845#1:1273,2\n845#1:1275,6\n845#1:1281\n848#1:1282,2\n848#1:1284,6\n848#1:1290\n851#1:1291,2\n851#1:1293,6\n851#1:1299\n854#1:1300,2\n854#1:1302,6\n854#1:1308\n875#1:1309,2\n875#1:1311,6\n875#1:1317\n881#1:1318,2\n881#1:1320,6\n881#1:1326\n887#1:1327,2\n887#1:1329,6\n887#1:1335\n891#1:1336,2\n891#1:1338,6\n891#1:1344\n898#1:1345,2\n898#1:1347,6\n898#1:1353\n907#1:1354,2\n907#1:1356,6\n907#1:1362\n908#1:1363,2\n908#1:1365,6\n908#1:1371\n912#1:1372,2\n912#1:1374,6\n912#1:1380\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    public final float animationProgress;

    @NotNull
    public final PaddingValues paddingValues;
    public final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, @NotNull PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7599measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        Measurable measurable4;
        Measurable measurable5;
        Measurable measurable6;
        Measurable measurable7;
        List<? extends Measurable> list2 = list;
        final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(this.paddingValues.getTop());
        int iMo7868roundToPx0680j_42 = measureScope.mo7868roundToPx0680j_4(this.paddingValues.getBottom());
        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i++;
        }
        Measurable measurable8 = measurable;
        final Placeable placeableMo12610measureBRTryo0 = measurable8 != null ? measurable8.mo12610measureBRTryo0(jM13613copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo0);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo0));
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i2++;
        }
        Measurable measurable9 = measurable2;
        Placeable placeableMo12610measureBRTryo02 = measurable9 != null ? measurable9.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(jM13613copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo02);
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo02));
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i3++;
        }
        Measurable measurable10 = measurable3;
        final Placeable placeableMo12610measureBRTryo03 = measurable10 != null ? measurable10.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(jM13613copyZbe2FdA$default, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = iWidthOrZero2 + TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo03);
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo03));
        int size4 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list2.get(i4);
            int i5 = size4;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i4++;
            size4 = i5;
        }
        Measurable measurable11 = measurable4;
        Placeable placeableMo12610measureBRTryo04 = measurable11 != null ? measurable11.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(jM13613copyZbe2FdA$default, -iWidthOrZero3, 0, 2, null)) : null;
        int iWidthOrZero4 = iWidthOrZero3 + TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo04);
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo04));
        int i6 = -iWidthOrZero4;
        long jM13638offsetNN6EwU = ConstraintsKt.m13638offsetNN6EwU(jM13613copyZbe2FdA$default, i6, -iMo7868roundToPx0680j_42);
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                measurable5 = null;
                break;
            }
            Measurable measurable12 = list2.get(i7);
            int i8 = size5;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable12), "Label")) {
                measurable5 = measurable12;
                break;
            }
            i7++;
            size5 = i8;
        }
        Measurable measurable13 = measurable5;
        Placeable placeableMo12610measureBRTryo05 = measurable13 != null ? measurable13.mo12610measureBRTryo0(jM13638offsetNN6EwU) : null;
        int size6 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size6) {
                measurable6 = null;
                break;
            }
            measurable6 = list2.get(i9);
            int i10 = size6;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i9++;
            size6 = i10;
        }
        Measurable measurable14 = measurable6;
        int iMinIntrinsicHeight = measurable14 != null ? measurable14.minIntrinsicHeight(Constraints.m13624getMinWidthimpl(j)) : 0;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo05) + iMo7868roundToPx0680j_4;
        long jM13638offsetNN6EwU2 = ConstraintsKt.m13638offsetNN6EwU(Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i6, ((-iHeightOrZero) - iMo7868roundToPx0680j_42) - iMinIntrinsicHeight);
        int size7 = list.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = size7;
            Measurable measurable15 = list2.get(i11);
            int i13 = i11;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable15), "TextField")) {
                final Placeable placeableMo12610measureBRTryo06 = measurable15.mo12610measureBRTryo0(jM13638offsetNN6EwU2);
                long jM13613copyZbe2FdA$default2 = Constraints.m13613copyZbe2FdA$default(jM13638offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list2.get(i14);
                    int i15 = size8;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable7), "Hint")) {
                        break;
                    }
                    i14++;
                    list2 = list;
                    size8 = i15;
                }
                Measurable measurable16 = measurable7;
                Placeable placeableMo12610measureBRTryo07 = measurable16 != null ? measurable16.mo12610measureBRTryo0(jM13613copyZbe2FdA$default2) : null;
                int iMax5 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo06), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo07)) + iHeightOrZero + iMo7868roundToPx0680j_42);
                final int iM10021calculateWidthyeHjK3Y = TextFieldKt.m10021calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo03), TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo04), placeableMo12610measureBRTryo06.getWidth(), TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo07), j);
                Placeable placeableMo12610measureBRTryo08 = measurable14 != null ? measurable14.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(ConstraintsKt.m13639offsetNN6EwU$default(jM13613copyZbe2FdA$default, 0, -iMax5, 1, null), 0, iM10021calculateWidthyeHjK3Y, 0, 0, 9, null)) : null;
                int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo08);
                final int iM10020calculateHeightmKXJcVc = TextFieldKt.m10020calculateHeightmKXJcVc(placeableMo12610measureBRTryo06.getHeight(), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo03), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo08), this.animationProgress, j, measureScope.getDensity(), this.paddingValues);
                int i16 = iM10020calculateHeightmKXJcVc - iHeightOrZero2;
                int size9 = list.size();
                for (int i17 = 0; i17 < size9; i17++) {
                    Measurable measurable17 = list.get(i17);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable17), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo12610measureBRTryo09 = measurable17.mo12610measureBRTryo0(ConstraintsKt.Constraints(iM10021calculateWidthyeHjK3Y != Integer.MAX_VALUE ? iM10021calculateWidthyeHjK3Y : 0, iM10021calculateWidthyeHjK3Y, i16 != Integer.MAX_VALUE ? i16 : 0, i16));
                        final Placeable placeable = placeableMo12610measureBRTryo05;
                        final Placeable placeable2 = placeableMo12610measureBRTryo07;
                        final Placeable placeable3 = placeableMo12610measureBRTryo02;
                        final Placeable placeable4 = placeableMo12610measureBRTryo04;
                        final Placeable placeable5 = placeableMo12610measureBRTryo08;
                        return MeasureScope.layout$default(measureScope, iM10021calculateWidthyeHjK3Y, iM10020calculateHeightmKXJcVc, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                Placeable placeable6 = placeable;
                                if (placeable6 == null) {
                                    TextFieldKt.placeWithoutLabel(placementScope, iM10021calculateWidthyeHjK3Y, iM10020calculateHeightmKXJcVc, placeableMo12610measureBRTryo06, placeable2, placeableMo12610measureBRTryo0, placeable3, placeableMo12610measureBRTryo03, placeable4, placeableMo12610measureBRTryo09, placeable5, this.singleLine, measureScope.getDensity(), this.paddingValues);
                                    return;
                                }
                                int i18 = iM10021calculateWidthyeHjK3Y;
                                int i19 = iM10020calculateHeightmKXJcVc;
                                Placeable placeable7 = placeableMo12610measureBRTryo06;
                                Placeable placeable8 = placeable2;
                                Placeable placeable9 = placeableMo12610measureBRTryo0;
                                Placeable placeable10 = placeable3;
                                Placeable placeable11 = placeableMo12610measureBRTryo03;
                                Placeable placeable12 = placeable4;
                                Placeable placeable13 = placeableMo12610measureBRTryo09;
                                Placeable placeable14 = placeable5;
                                boolean z = this.singleLine;
                                int i20 = iMo7868roundToPx0680j_4;
                                TextFieldKt.placeWithLabel(placementScope, i18, i19, placeable7, placeable6, placeable8, placeable9, placeable10, placeable11, placeable12, placeable13, placeable14, z, i20, placeable.getHeight() + i20, this.animationProgress, measureScope.getDensity());
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i11 = i13 + 1;
            size7 = i12;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable7 = measurables.get(i);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), "TextField")) {
                int iIntValue = intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i2 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i2 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i2);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i2++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable9, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = measurables.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable11, Integer.valueOf(height)).intValue() : 0;
                int size6 = measurables.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = measurables.get(i6);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), "Leading")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable12, Integer.valueOf(height)).intValue() : 0;
                int size7 = measurables.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = measurables.get(i7);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return TextFieldKt.m10021calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable14, Integer.valueOf(height)).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i2;
        IntrinsicMeasurable intrinsicMeasurable5;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "Leading")) {
                break;
            }
            i3++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(i, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i)).intValue();
        } else {
            iSubstractConstraintSafely = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i4);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Trailing")) {
                break;
            }
            i4++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(intrinsicMeasurable9, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Label")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue4 = intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(iSubstractConstraintSafely)).intValue() : 0;
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i6);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            int iIntValue5 = function2.invoke(intrinsicMeasurable11, Integer.valueOf(iSubstractConstraintSafely)).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
            i2 = iIntValue5;
        } else {
            i2 = 0;
        }
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            iIntValue3 = function2.invoke(intrinsicMeasurable12, Integer.valueOf(iSubstractConstraintSafely)).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size6 = list.size();
        for (int i8 = 0; i8 < size6; i8++) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), "TextField")) {
                int iIntValue6 = function2.invoke(intrinsicMeasurable13, Integer.valueOf(iSubstractConstraintSafely)).intValue();
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), "Hint")) {
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue7 = intrinsicMeasurable14 != null ? function2.invoke(intrinsicMeasurable14, Integer.valueOf(iSubstractConstraintSafely)).intValue() : 0;
                int size8 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    intrinsicMeasurable7 = list.get(i10);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                return TextFieldKt.m10020calculateHeightmKXJcVc(iIntValue6, iIntValue4, iIntValue, iIntValue2, i2, iIntValue3, iIntValue7, intrinsicMeasurable15 != null ? function2.invoke(intrinsicMeasurable15, Integer.valueOf(i)).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
