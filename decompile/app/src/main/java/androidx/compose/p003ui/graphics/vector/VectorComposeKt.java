package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.PathFillType;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.motion.widget.Key;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VectorCompose.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a¦\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m7105d2 = {"Group", "", "name", "", Key.ROTATION, "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    @VectorComposable
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(@Nullable String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @Nullable List<? extends PathNode> list, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f8;
        int i5;
        float f9;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        List<? extends PathNode> emptyPath;
        final float f15;
        final float f16;
        final float f17;
        final float f18;
        final float f19;
        final List<? extends PathNode> list2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-213417674);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f8 = f2;
                    i3 |= composerStartRestartGroup.changed(f8) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        f9 = f3;
                        i3 |= composerStartRestartGroup.changed(f9) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= CpioConstants.C_ISBLK;
                    } else if ((i & 57344) == 0) {
                        i3 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(f5) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= composerStartRestartGroup.changed(f6) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(f7) ? 8388608 : 4194304;
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                        i3 |= NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i2 & 512) != 0) {
                        i11 = (1879048192 & i) == 0 ? composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456 : 805306368;
                        if (i10 != 256 || (1533916891 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                str2 = i12 == 0 ? "" : str;
                                f10 = i13 == 0 ? 0.0f : f;
                                if (i4 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i5 != 0) {
                                    f9 = 0.0f;
                                }
                                f11 = i6 == 0 ? 1.0f : f4;
                                f12 = i7 == 0 ? f5 : 1.0f;
                                f13 = i8 == 0 ? 0.0f : f6;
                                f14 = i9 == 0 ? f7 : 0.0f;
                                if (i10 == 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                }
                                C18621 c18621 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final GroupComponent invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                composerStartRestartGroup.startReplaceableGroup(-548224868);
                                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(c18621);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                        invoke2(groupComponent, str3);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str3) {
                                        groupComponent.setName(str3);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setRotation(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setPivotX(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setPivotY(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setScaleX(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setScaleY(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setTranslationX(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                        groupComponent.setTranslationY(f20);
                                    }
                                });
                                Updater.m10877setimpl(composerM10870constructorimpl, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                        invoke2(groupComponent, list3);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                        groupComponent.setClipPathData(list3);
                                    }
                                });
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f15 = f14;
                                f16 = f12;
                                f17 = f8;
                                f18 = f9;
                                f19 = f13;
                                list2 = emptyPath;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i10 != 0) {
                                    i3 &= -234881025;
                                }
                                str2 = str;
                                f10 = f;
                                f11 = f4;
                                f12 = f5;
                                f13 = f6;
                                f14 = f7;
                            }
                            emptyPath = list;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            C18621 c186212 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-548224868);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                    invoke2(groupComponent, str3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str3) {
                                    groupComponent.setName(str3);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setRotation(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setPivotX(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setPivotY(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setScaleX(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setScaleY(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setTranslationX(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f20) {
                                    groupComponent.setTranslationY(f20);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl2, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f15 = f14;
                            f16 = f12;
                            f17 = f8;
                            f18 = f9;
                            f19 = f13;
                            list2 = emptyPath;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            str2 = str;
                            f10 = f;
                            f11 = f4;
                            f16 = f5;
                            f19 = f6;
                            f15 = f7;
                            f17 = f8;
                            f18 = f9;
                            list2 = list;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final String str3 = str2;
                            final float f20 = f10;
                            final float f21 = f11;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    VectorComposeKt.Group(str3, f20, f17, f18, f21, f16, f19, f15, list2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i11;
                    if (i10 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            C18621 c1862122 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-548224868);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            Composer composerM10870constructorimpl22 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl22, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str32) {
                                    invoke2(groupComponent, str32);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str32) {
                                    groupComponent.setName(str32);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setRotation(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setPivotX(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setPivotY(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setScaleX(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setScaleY(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setTranslationX(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f202) {
                                    groupComponent.setTranslationY(f202);
                                }
                            });
                            Updater.m10877setimpl(composerM10870constructorimpl22, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f15 = f14;
                            f16 = f12;
                            f17 = f8;
                            f18 = f9;
                            f19 = f13;
                            list2 = emptyPath;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f9 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i11;
                if (i10 != 256) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f8 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f9 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i11;
            if (i10 != 256) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f8 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f9 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i11;
        if (i10 != 256) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @VectorComposable
    @Composable
    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m11986Path9cdaXJ4(@NotNull final List<? extends PathNode> list, int i, @Nullable String str, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        final int defaultFillType = (i6 & 2) != 0 ? VectorKt.getDefaultFillType() : i;
        final String str2 = (i6 & 4) != 0 ? "" : str;
        final Brush brush3 = (i6 & 8) != 0 ? null : brush;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        Brush brush4 = (i6 & 32) != 0 ? null : brush2;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i6 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i6 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i4, i5, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
        }
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, str2, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str3) {
                invoke2(pathComponent, str3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @NotNull String str3) {
                pathComponent.setName(str3);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                invoke2(pathComponent, list2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @NotNull List<? extends PathNode> list2) {
                pathComponent.setPathData(list2);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, PathFillType.m11615boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m11988invokepweu1eQ(pathComponent, pathFillType.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m11988invokepweu1eQ(@NotNull PathComponent pathComponent, int i7) {
                pathComponent.m11980setPathFillTypeoQ8Xj4U(i7);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @Nullable Brush brush5) {
                pathComponent.setFill(brush5);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setFillAlpha(f15);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @Nullable Brush brush5) {
                pathComponent.setStroke(brush5);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f9), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setStrokeAlpha(f15);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f10), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setStrokeLineWidth(f15);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, StrokeJoin.m11695boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m11989invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m11989invokekLtJ_vA(@NotNull PathComponent pathComponent, int i7) {
                pathComponent.m11982setStrokeLineJoinWw9F2mQ(i7);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, StrokeCap.m11685boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m11987invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m11987invokeCSYIeUk(@NotNull PathComponent pathComponent, int i7) {
                pathComponent.m11981setStrokeLineCapBeK7IIE(i7);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f11), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setStrokeLineMiter(f15);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f12), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathStart(f15);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f13), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathEnd(f15);
            }
        });
        Updater.m10877setimpl(composerM10870constructorimpl, Float.valueOf(f14), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathOffset(f15);
            }
        });
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f15 = f8;
            final Brush brush5 = brush4;
            final float f16 = f9;
            final float f17 = f10;
            final int i7 = defaultStrokeLineCap;
            final int i8 = defaultStrokeLineJoin;
            final float f18 = f11;
            final float f19 = f12;
            final float f20 = f13;
            final float f21 = f14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    VectorComposeKt.m11986Path9cdaXJ4(list, defaultFillType, str2, brush3, f15, brush5, f16, f17, i7, i8, f18, f19, f20, f21, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                }
            });
        }
    }
}
