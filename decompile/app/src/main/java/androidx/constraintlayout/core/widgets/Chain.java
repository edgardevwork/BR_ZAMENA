package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Chain {
    public static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r8 r16
  0x0033: PHI (r8v39 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r8 r16
  0x0035: PHI (r8v3 boolean) = (r8v1 boolean), (r8v41 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:26:0x004b, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        int i3;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor constraintAnchor2;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        float f;
        int size;
        ArrayList<ConstraintWidget> arrayList;
        int i4;
        boolean z4;
        boolean z5;
        ConstraintWidget constraintWidget7;
        ConstraintWidget constraintWidget8;
        int i5;
        int i6 = i;
        ConstraintWidget constraintWidget9 = chainHead.mFirst;
        ConstraintWidget constraintWidget10 = chainHead.mLast;
        ConstraintWidget constraintWidget11 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget12 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget13 = chainHead.mHead;
        float f2 = chainHead.mTotalWeight;
        boolean z6 = constraintWidgetContainer.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i6 == 0) {
            int i7 = constraintWidget13.mHorizontalChainStyle;
            z = i7 == 0;
            z2 = i7 == 1;
            z3 = i7 == 2;
        } else {
            int i8 = constraintWidget13.mVerticalChainStyle;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
            }
        }
        boolean z7 = z2;
        boolean z8 = false;
        boolean z9 = z;
        ?? r8 = constraintWidget9;
        while (true) {
            if (z8) {
                break;
            }
            ConstraintAnchor constraintAnchor3 = r8.mListAnchors[i2];
            int i9 = z3 ? 1 : 4;
            int margin = constraintAnchor3.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r8.mListDimensionBehaviors[i6];
            float f3 = f2;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && r8.mResolvedMatchConstraintDefault[i6] == 0) {
                z4 = z8;
                z5 = true;
            } else {
                z4 = z8;
                z5 = false;
            }
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
            if (constraintAnchor4 != null && r8 != constraintWidget9) {
                margin += constraintAnchor4.getMargin();
            }
            int i10 = margin;
            if (!z3 || r8 == constraintWidget9 || r8 == constraintWidget11) {
                constraintWidget7 = constraintWidget13;
            } else {
                constraintWidget7 = constraintWidget13;
                i9 = 8;
            }
            ConstraintAnchor constraintAnchor5 = constraintAnchor3.mTarget;
            if (constraintAnchor5 != null) {
                if (r8 == constraintWidget11) {
                    constraintWidget8 = constraintWidget9;
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor5.mSolverVariable, i10, 6);
                } else {
                    constraintWidget8 = constraintWidget9;
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor5.mSolverVariable, i10, 8);
                }
                if (z5 && !z3) {
                    i9 = 5;
                }
                linearSystem.addEquality(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i10, (r8 == constraintWidget11 && z3 && r8.isInBarrier(i6)) ? 5 : i9);
            } else {
                constraintWidget8 = constraintWidget9;
            }
            if (z6) {
                if (r8.getVisibility() == 8 || r8.mListDimensionBehaviors[i6] != dimensionBehaviour2) {
                    i5 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r8.mListAnchors;
                    i5 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr[i2 + 1].mSolverVariable, constraintAnchorArr[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r8.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i5, 8);
            }
            ConstraintAnchor constraintAnchor6 = r8.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor6 != null) {
                ?? r1 = constraintAnchor6.mOwner;
                ConstraintAnchor constraintAnchor7 = r1.mListAnchors[i2].mTarget;
                if (constraintAnchor7 != null && constraintAnchor7.mOwner == r8) {
                    solverVariable = r1;
                }
            }
            if (solverVariable != null) {
                r8 = solverVariable;
                z8 = z4;
            } else {
                z8 = true;
            }
            constraintWidget13 = constraintWidget7;
            f2 = f3;
            constraintWidget9 = constraintWidget8;
            r8 = r8;
        }
        ConstraintWidget constraintWidget14 = constraintWidget13;
        float f4 = f2;
        ConstraintWidget constraintWidget15 = constraintWidget9;
        if (constraintWidget12 != null) {
            int i11 = i2 + 1;
            if (constraintWidget10.mListAnchors[i11].mTarget != null) {
                ConstraintAnchor constraintAnchor8 = constraintWidget12.mListAnchors[i11];
                if (constraintWidget12.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget12.mResolvedMatchConstraintDefault[i6] == 0 && !z3) {
                    ConstraintAnchor constraintAnchor9 = constraintAnchor8.mTarget;
                    if (constraintAnchor9.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor9.mSolverVariable, -constraintAnchor8.getMargin(), 5);
                    }
                    linearSystem.addLowerThan(constraintAnchor8.mSolverVariable, constraintWidget10.mListAnchors[i11].mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 6);
                } else {
                    if (z3) {
                        ConstraintAnchor constraintAnchor10 = constraintAnchor8.mTarget;
                        if (constraintAnchor10.mOwner == constraintWidgetContainer) {
                            linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor10.mSolverVariable, -constraintAnchor8.getMargin(), 4);
                        }
                    }
                    linearSystem.addLowerThan(constraintAnchor8.mSolverVariable, constraintWidget10.mListAnchors[i11].mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 6);
                }
            }
        }
        if (z6) {
            int i12 = i2 + 1;
            SolverVariable solverVariable4 = constraintWidgetContainer.mListAnchors[i12].mSolverVariable;
            ConstraintAnchor constraintAnchor11 = constraintWidget10.mListAnchors[i12];
            linearSystem.addGreaterThan(solverVariable4, constraintAnchor11.mSolverVariable, constraintAnchor11.getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList2 = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f4 : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            float f7 = 0.0f;
            ConstraintWidget constraintWidget16 = null;
            int i13 = 0;
            while (i13 < size) {
                ConstraintWidget constraintWidget17 = arrayList2.get(i13);
                float f8 = constraintWidget17.mWeight[i6];
                if (f8 < f6) {
                    if (chainHead.mHasComplexMatchWeights) {
                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget17.mListAnchors;
                        linearSystem.addEquality(constraintAnchorArr2[i2 + 1].mSolverVariable, constraintAnchorArr2[i2].mSolverVariable, 0, 4);
                        arrayList = arrayList2;
                        i4 = size;
                        i13++;
                        size = i4;
                        arrayList2 = arrayList;
                        f6 = 0.0f;
                    } else {
                        f8 = 1.0f;
                    }
                }
                if (f8 == 0.0f) {
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget17.mListAnchors;
                    linearSystem.addEquality(constraintAnchorArr3[i2 + 1].mSolverVariable, constraintAnchorArr3[i2].mSolverVariable, 0, 8);
                    arrayList = arrayList2;
                    i4 = size;
                    i13++;
                    size = i4;
                    arrayList2 = arrayList;
                    f6 = 0.0f;
                } else {
                    if (constraintWidget16 != null) {
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget16.mListAnchors;
                        SolverVariable solverVariable5 = constraintAnchorArr4[i2].mSolverVariable;
                        int i14 = i2 + 1;
                        SolverVariable solverVariable6 = constraintAnchorArr4[i14].mSolverVariable;
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget17.mListAnchors;
                        arrayList = arrayList2;
                        SolverVariable solverVariable7 = constraintAnchorArr5[i2].mSolverVariable;
                        SolverVariable solverVariable8 = constraintAnchorArr5[i14].mSolverVariable;
                        i4 = size;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f8, solverVariable5, solverVariable6, solverVariable7, solverVariable8);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    } else {
                        arrayList = arrayList2;
                        i4 = size;
                    }
                    constraintWidget16 = constraintWidget17;
                    f7 = f8;
                    i13++;
                    size = i4;
                    arrayList2 = arrayList;
                    f6 = 0.0f;
                }
            }
        }
        if (constraintWidget11 != null && (constraintWidget11 == constraintWidget12 || z3)) {
            ConstraintAnchor constraintAnchor12 = constraintWidget15.mListAnchors[i2];
            int i15 = i2 + 1;
            ConstraintAnchor constraintAnchor13 = constraintWidget10.mListAnchors[i15];
            ConstraintAnchor constraintAnchor14 = constraintAnchor12.mTarget;
            SolverVariable solverVariable9 = constraintAnchor14 != null ? constraintAnchor14.mSolverVariable : null;
            ConstraintAnchor constraintAnchor15 = constraintAnchor13.mTarget;
            SolverVariable solverVariable10 = constraintAnchor15 != null ? constraintAnchor15.mSolverVariable : null;
            ConstraintAnchor constraintAnchor16 = constraintWidget11.mListAnchors[i2];
            if (constraintWidget12 != null) {
                constraintAnchor13 = constraintWidget12.mListAnchors[i15];
            }
            if (solverVariable9 != null && solverVariable10 != null) {
                if (i6 == 0) {
                    f = constraintWidget14.mHorizontalBiasPercent;
                } else {
                    f = constraintWidget14.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor16.mSolverVariable, solverVariable9, constraintAnchor16.getMargin(), f, solverVariable10, constraintAnchor13.mSolverVariable, constraintAnchor13.getMargin(), 7);
            }
        } else if (!z9 || constraintWidget11 == null) {
            int i16 = 8;
            if (z7 && constraintWidget11 != null) {
                int i17 = chainHead.mWidgetsMatchCount;
                boolean z10 = i17 > 0 && chainHead.mWidgetsCount == i17;
                ConstraintWidget constraintWidget18 = constraintWidget11;
                ConstraintWidget constraintWidget19 = constraintWidget18;
                while (constraintWidget19 != null) {
                    ConstraintWidget constraintWidget20 = constraintWidget19.mNextChainWidget[i6];
                    while (constraintWidget20 != null && constraintWidget20.getVisibility() == i16) {
                        constraintWidget20 = constraintWidget20.mNextChainWidget[i6];
                    }
                    if (constraintWidget19 == constraintWidget11 || constraintWidget19 == constraintWidget12 || constraintWidget20 == null) {
                        constraintWidget = constraintWidget18;
                        i3 = i16;
                    } else {
                        ConstraintWidget constraintWidget21 = constraintWidget20 == constraintWidget12 ? null : constraintWidget20;
                        ConstraintAnchor constraintAnchor17 = constraintWidget19.mListAnchors[i2];
                        SolverVariable solverVariable11 = constraintAnchor17.mSolverVariable;
                        ConstraintAnchor constraintAnchor18 = constraintAnchor17.mTarget;
                        if (constraintAnchor18 != null) {
                            SolverVariable solverVariable12 = constraintAnchor18.mSolverVariable;
                        }
                        int i18 = i2 + 1;
                        SolverVariable solverVariable13 = constraintWidget18.mListAnchors[i18].mSolverVariable;
                        int margin2 = constraintAnchor17.getMargin();
                        int margin3 = constraintWidget19.mListAnchors[i18].getMargin();
                        if (constraintWidget21 != null) {
                            constraintAnchor = constraintWidget21.mListAnchors[i2];
                            SolverVariable solverVariable14 = constraintAnchor.mSolverVariable;
                            constraintWidget2 = constraintWidget21;
                            ConstraintAnchor constraintAnchor19 = constraintAnchor.mTarget;
                            solverVariable2 = constraintAnchor19 != null ? constraintAnchor19.mSolverVariable : null;
                            solverVariable = solverVariable14;
                        } else {
                            constraintWidget2 = constraintWidget21;
                            constraintAnchor = constraintWidget12.mListAnchors[i2];
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            solverVariable2 = constraintWidget19.mListAnchors[i18].mSolverVariable;
                        }
                        if (constraintAnchor != null) {
                            margin3 += constraintAnchor.getMargin();
                        }
                        int i19 = margin3;
                        int margin4 = constraintWidget18.mListAnchors[i18].getMargin() + margin2;
                        int i20 = z10 ? 8 : 4;
                        if (solverVariable11 == null || solverVariable13 == null || solverVariable == null || solverVariable2 == null) {
                            constraintWidget3 = constraintWidget2;
                            constraintWidget = constraintWidget18;
                            i3 = 8;
                        } else {
                            constraintWidget3 = constraintWidget2;
                            constraintWidget = constraintWidget18;
                            i3 = 8;
                            linearSystem.addCentering(solverVariable11, solverVariable13, margin4, 0.5f, solverVariable, solverVariable2, i19, i20);
                        }
                        constraintWidget20 = constraintWidget3;
                    }
                    constraintWidget18 = constraintWidget19.getVisibility() != i3 ? constraintWidget19 : constraintWidget;
                    constraintWidget19 = constraintWidget20;
                    i16 = i3;
                    i6 = i;
                }
                ConstraintAnchor constraintAnchor20 = constraintWidget11.mListAnchors[i2];
                ConstraintAnchor constraintAnchor21 = constraintWidget15.mListAnchors[i2].mTarget;
                int i21 = i2 + 1;
                ConstraintAnchor constraintAnchor22 = constraintWidget12.mListAnchors[i21];
                ConstraintAnchor constraintAnchor23 = constraintWidget10.mListAnchors[i21].mTarget;
                if (constraintAnchor21 != null) {
                    if (constraintWidget11 != constraintWidget12) {
                        linearSystem.addEquality(constraintAnchor20.mSolverVariable, constraintAnchor21.mSolverVariable, constraintAnchor20.getMargin(), 5);
                    } else if (constraintAnchor23 != null) {
                        linearSystem.addCentering(constraintAnchor20.mSolverVariable, constraintAnchor21.mSolverVariable, constraintAnchor20.getMargin(), 0.5f, constraintAnchor22.mSolverVariable, constraintAnchor23.mSolverVariable, constraintAnchor22.getMargin(), 5);
                    }
                }
                if (constraintAnchor23 != null && constraintWidget11 != constraintWidget12) {
                    linearSystem.addEquality(constraintAnchor22.mSolverVariable, constraintAnchor23.mSolverVariable, -constraintAnchor22.getMargin(), 5);
                }
            }
        } else {
            int i22 = chainHead.mWidgetsMatchCount;
            boolean z11 = i22 > 0 && chainHead.mWidgetsCount == i22;
            ConstraintWidget constraintWidget22 = constraintWidget11;
            ConstraintWidget constraintWidget23 = constraintWidget22;
            while (constraintWidget23 != null) {
                ConstraintWidget constraintWidget24 = constraintWidget23.mNextChainWidget[i6];
                while (constraintWidget24 != null && constraintWidget24.getVisibility() == 8) {
                    constraintWidget24 = constraintWidget24.mNextChainWidget[i6];
                }
                if (constraintWidget24 != null || constraintWidget23 == constraintWidget12) {
                    ConstraintAnchor constraintAnchor24 = constraintWidget23.mListAnchors[i2];
                    SolverVariable solverVariable15 = constraintAnchor24.mSolverVariable;
                    ConstraintAnchor constraintAnchor25 = constraintAnchor24.mTarget;
                    SolverVariable solverVariable16 = constraintAnchor25 != null ? constraintAnchor25.mSolverVariable : null;
                    if (constraintWidget22 != constraintWidget23) {
                        solverVariable16 = constraintWidget22.mListAnchors[i2 + 1].mSolverVariable;
                    } else if (constraintWidget23 == constraintWidget11) {
                        ConstraintAnchor constraintAnchor26 = constraintWidget15.mListAnchors[i2].mTarget;
                        solverVariable16 = constraintAnchor26 != null ? constraintAnchor26.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor24.getMargin();
                    int i23 = i2 + 1;
                    int margin6 = constraintWidget23.mListAnchors[i23].getMargin();
                    if (constraintWidget24 != null) {
                        constraintAnchor2 = constraintWidget24.mListAnchors[i2];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget10.mListAnchors[i23].mTarget;
                        if (constraintAnchor2 != null) {
                            solverVariable3 = constraintAnchor2.mSolverVariable;
                        } else {
                            constraintWidget4 = constraintWidget24;
                            solverVariable3 = null;
                            SolverVariable solverVariable17 = constraintWidget23.mListAnchors[i23].mSolverVariable;
                            if (constraintAnchor2 != null) {
                                margin6 += constraintAnchor2.getMargin();
                            }
                            int margin7 = margin5 + constraintWidget22.mListAnchors[i23].getMargin();
                            if (solverVariable15 != null || solverVariable16 == null || solverVariable3 == null || solverVariable17 == null) {
                                constraintWidget5 = constraintWidget4;
                            } else {
                                if (constraintWidget23 == constraintWidget11) {
                                    margin7 = constraintWidget11.mListAnchors[i2].getMargin();
                                }
                                int i24 = margin7;
                                constraintWidget5 = constraintWidget4;
                                constraintWidget6 = constraintWidget22;
                                linearSystem.addCentering(solverVariable15, solverVariable16, i24, 0.5f, solverVariable3, solverVariable17, constraintWidget23 == constraintWidget12 ? constraintWidget12.mListAnchors[i23].getMargin() : margin6, z11 ? 8 : 5);
                                if (constraintWidget23.getVisibility() != 8) {
                                    constraintWidget23 = constraintWidget6;
                                }
                                constraintWidget22 = constraintWidget23;
                                constraintWidget23 = constraintWidget5;
                            }
                        }
                    }
                    constraintWidget4 = constraintWidget24;
                    SolverVariable solverVariable172 = constraintWidget23.mListAnchors[i23].mSolverVariable;
                    if (constraintAnchor2 != null) {
                    }
                    int margin72 = margin5 + constraintWidget22.mListAnchors[i23].getMargin();
                    if (solverVariable15 != null) {
                    }
                    constraintWidget5 = constraintWidget4;
                } else {
                    constraintWidget5 = constraintWidget24;
                }
                constraintWidget6 = constraintWidget22;
                if (constraintWidget23.getVisibility() != 8) {
                }
                constraintWidget22 = constraintWidget23;
                constraintWidget23 = constraintWidget5;
            }
        }
        if ((!z9 && !z7) || constraintWidget11 == null || constraintWidget11 == constraintWidget12) {
            return;
        }
        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget11.mListAnchors;
        ConstraintAnchor constraintAnchor27 = constraintAnchorArr6[i2];
        if (constraintWidget12 == null) {
            constraintWidget12 = constraintWidget11;
        }
        int i25 = i2 + 1;
        ConstraintAnchor constraintAnchor28 = constraintWidget12.mListAnchors[i25];
        ConstraintAnchor constraintAnchor29 = constraintAnchor27.mTarget;
        SolverVariable solverVariable18 = constraintAnchor29 != null ? constraintAnchor29.mSolverVariable : null;
        ConstraintAnchor constraintAnchor30 = constraintAnchor28.mTarget;
        SolverVariable solverVariable19 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
        if (constraintWidget10 != constraintWidget12) {
            ConstraintAnchor constraintAnchor31 = constraintWidget10.mListAnchors[i25].mTarget;
            solverVariable19 = constraintAnchor31 != null ? constraintAnchor31.mSolverVariable : null;
        }
        if (constraintWidget11 == constraintWidget12) {
            constraintAnchor28 = constraintAnchorArr6[i25];
        }
        if (solverVariable18 == null || solverVariable19 == null) {
            return;
        }
        linearSystem.addCentering(constraintAnchor27.mSolverVariable, solverVariable18, constraintAnchor27.getMargin(), 0.5f, solverVariable19, constraintAnchor28.mSolverVariable, constraintWidget12.mListAnchors[i25].getMargin(), 5);
    }
}
