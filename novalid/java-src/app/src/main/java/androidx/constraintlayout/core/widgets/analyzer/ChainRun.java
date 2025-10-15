package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ChainRun extends WidgetRun {
    public int chainStyle;
    public ArrayList<WidgetRun> widgets;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.widgets = new ArrayList<>();
        this.orientation = i;
        build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i = 0; i < size; i++) {
            if (!this.widgets.get(i).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.widgets.size();
        long wrapDimension = 0;
        for (int i = 0; i < size; i++) {
            wrapDimension = wrapDimension + r4.start.margin + this.widgets.get(i).getWrapDimension() + r4.end.margin;
        }
        return wrapDimension;
    }

    public final void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.widget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i = this.orientation;
            if (i == 0) {
                next.widget.horizontalChainRun = this;
            } else if (i == 1) {
                next.widget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.widget.getParent()).isRtl() && this.widgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.widgets;
            this.widget = arrayList.get(arrayList.size() - 1).widget;
        }
        this.chainStyle = this.orientation == 0 ? this.widget.getHorizontalChainStyle() : this.widget.getVerticalChainStyle();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:389:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0153  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(Dependency dependency) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.widget.getParent();
            boolean zIsRtl = parent instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) parent).isRtl() : false;
            int i18 = this.end.value - this.start.value;
            int size = this.widgets.size();
            int i19 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i19 >= size) {
                    i19 = -1;
                    break;
                } else if (this.widgets.get(i19).widget.getVisibility() != 8) {
                    break;
                } else {
                    i19++;
                }
            }
            int i20 = size - 1;
            int i21 = i20;
            while (true) {
                if (i21 < 0) {
                    break;
                }
                if (this.widgets.get(i21).widget.getVisibility() != 8) {
                    i = i21;
                    break;
                }
                i21--;
            }
            int i22 = 0;
            while (i22 < 2) {
                int i23 = 0;
                i4 = 0;
                i5 = 0;
                int i24 = 0;
                f = 0.0f;
                while (i23 < size) {
                    WidgetRun widgetRun = this.widgets.get(i23);
                    if (widgetRun.widget.getVisibility() != i2) {
                        i24++;
                        if (i23 > 0 && i23 >= i19) {
                            i4 += widgetRun.start.margin;
                        }
                        DimensionDependency dimensionDependency = widgetRun.dimension;
                        int i25 = dimensionDependency.value;
                        boolean z3 = widgetRun.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z3) {
                            int i26 = this.orientation;
                            if (i26 == 0 && !widgetRun.widget.horizontalRun.dimension.resolved) {
                                return;
                            }
                            if (i26 == 1 && !widgetRun.widget.verticalRun.dimension.resolved) {
                                return;
                            } else {
                                i16 = i25;
                            }
                        } else {
                            i16 = i25;
                            if (widgetRun.matchConstraintsType == 1 && i22 == 0) {
                                i17 = dimensionDependency.wrapValue;
                                i5++;
                            } else if (dimensionDependency.resolved) {
                                i17 = i16;
                            }
                            z3 = true;
                            if (z3) {
                                i5++;
                                float f3 = widgetRun.widget.mWeight[this.orientation];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i17;
                            }
                            if (i23 >= i20 && i23 < i) {
                                i4 += -widgetRun.end.margin;
                            }
                        }
                        i17 = i16;
                        if (z3) {
                        }
                        if (i23 >= i20) {
                        }
                    }
                    i23++;
                    i2 = 8;
                }
                if (i4 < i18 || i5 == 0) {
                    i3 = i24;
                    break;
                } else {
                    i22++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i27 = this.start.value;
            if (zIsRtl) {
                i27 = this.end.value;
            }
            if (i4 > i18) {
                i27 = zIsRtl ? i27 + ((int) (((i4 - i18) / 2.0f) + 0.5f)) : i27 - ((int) (((i4 - i18) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f4 = i18 - i4;
                int i28 = (int) ((f4 / i5) + 0.5f);
                int i29 = 0;
                int i30 = 0;
                while (i29 < size) {
                    WidgetRun widgetRun2 = this.widgets.get(i29);
                    int i31 = i28;
                    int i32 = i4;
                    if (widgetRun2.widget.getVisibility() != 8 && widgetRun2.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.dimension;
                        if (dimensionDependency2.resolved) {
                            z2 = zIsRtl;
                            i15 = i3;
                            i11 = i27;
                            f2 = f4;
                        } else {
                            if (f > 0.0f) {
                                i11 = i27;
                                i12 = (int) (((widgetRun2.widget.mWeight[this.orientation] * f4) / f) + 0.5f);
                            } else {
                                i11 = i27;
                                i12 = i31;
                            }
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.widget;
                                f2 = f4;
                                i14 = constraintWidget.mMatchConstraintMaxWidth;
                                i13 = constraintWidget.mMatchConstraintMinWidth;
                                z2 = zIsRtl;
                            } else {
                                f2 = f4;
                                ConstraintWidget constraintWidget2 = widgetRun2.widget;
                                int i33 = constraintWidget2.mMatchConstraintMaxHeight;
                                z2 = zIsRtl;
                                i13 = constraintWidget2.mMatchConstraintMinHeight;
                                i14 = i33;
                            }
                            i15 = i3;
                            int iMax = Math.max(i13, widgetRun2.matchConstraintsType == 1 ? Math.min(i12, dimensionDependency2.wrapValue) : i12);
                            if (i14 > 0) {
                                iMax = Math.min(i14, iMax);
                            }
                            if (iMax != i12) {
                                i30++;
                                i12 = iMax;
                            }
                            widgetRun2.dimension.resolve(i12);
                        }
                    }
                    i29++;
                    i28 = i31;
                    i4 = i32;
                    i27 = i11;
                    f4 = f2;
                    zIsRtl = z2;
                    i3 = i15;
                }
                z = zIsRtl;
                i6 = i3;
                i7 = i27;
                int i34 = i4;
                if (i30 > 0) {
                    i5 -= i30;
                    i4 = 0;
                    for (int i35 = 0; i35 < size; i35++) {
                        WidgetRun widgetRun3 = this.widgets.get(i35);
                        if (widgetRun3.widget.getVisibility() != 8) {
                            if (i35 > 0 && i35 >= i19) {
                                i4 += widgetRun3.start.margin;
                            }
                            i4 += widgetRun3.dimension.value;
                            if (i35 < i20 && i35 < i) {
                                i4 += -widgetRun3.end.margin;
                            }
                        }
                    }
                } else {
                    i4 = i34;
                }
                i9 = 2;
                if (this.chainStyle == 2 && i30 == 0) {
                    i8 = 0;
                    this.chainStyle = 0;
                } else {
                    i8 = 0;
                }
            } else {
                z = zIsRtl;
                i6 = i3;
                i7 = i27;
                i8 = 0;
                i9 = 2;
            }
            if (i4 > i18) {
                this.chainStyle = i9;
            }
            if (i6 > 0 && i5 == 0 && i19 == i) {
                this.chainStyle = i9;
            }
            int i36 = this.chainStyle;
            if (i36 == 1) {
                int i37 = i6;
                if (i37 > 1) {
                    i10 = (i18 - i4) / (i37 - 1);
                } else {
                    i10 = i37 == 1 ? (i18 - i4) / 2 : i8;
                }
                if (i5 > 0) {
                    i10 = i8;
                }
                int i38 = i7;
                for (int i39 = i8; i39 < size; i39++) {
                    WidgetRun widgetRun4 = this.widgets.get(z ? size - (i39 + 1) : i39);
                    if (widgetRun4.widget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i38);
                        widgetRun4.end.resolve(i38);
                    } else {
                        if (i39 > 0) {
                            i38 = z ? i38 - i10 : i38 + i10;
                        }
                        if (i39 > 0 && i39 >= i19) {
                            if (z) {
                                i38 -= widgetRun4.start.margin;
                            } else {
                                i38 += widgetRun4.start.margin;
                            }
                        }
                        if (z) {
                            widgetRun4.end.resolve(i38);
                        } else {
                            widgetRun4.start.resolve(i38);
                        }
                        DimensionDependency dimensionDependency3 = widgetRun4.dimension;
                        int i40 = dimensionDependency3.value;
                        if (widgetRun4.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i40 = dimensionDependency3.wrapValue;
                        }
                        i38 = z ? i38 - i40 : i38 + i40;
                        if (z) {
                            widgetRun4.start.resolve(i38);
                        } else {
                            widgetRun4.end.resolve(i38);
                        }
                        widgetRun4.resolved = true;
                        if (i39 < i20 && i39 < i) {
                            if (z) {
                                i38 -= -widgetRun4.end.margin;
                            } else {
                                i38 += -widgetRun4.end.margin;
                            }
                        }
                    }
                }
                return;
            }
            int i41 = i6;
            if (i36 == 0) {
                int i42 = (i18 - i4) / (i41 + 1);
                if (i5 > 0) {
                    i42 = i8;
                }
                int i43 = i7;
                for (int i44 = i8; i44 < size; i44++) {
                    WidgetRun widgetRun5 = this.widgets.get(z ? size - (i44 + 1) : i44);
                    if (widgetRun5.widget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i43);
                        widgetRun5.end.resolve(i43);
                    } else {
                        int i45 = z ? i43 - i42 : i43 + i42;
                        if (i44 > 0 && i44 >= i19) {
                            if (z) {
                                i45 -= widgetRun5.start.margin;
                            } else {
                                i45 += widgetRun5.start.margin;
                            }
                        }
                        if (z) {
                            widgetRun5.end.resolve(i45);
                        } else {
                            widgetRun5.start.resolve(i45);
                        }
                        DimensionDependency dimensionDependency4 = widgetRun5.dimension;
                        int iMin = dimensionDependency4.value;
                        if (widgetRun5.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            iMin = Math.min(iMin, dimensionDependency4.wrapValue);
                        }
                        i43 = z ? i45 - iMin : i45 + iMin;
                        if (z) {
                            widgetRun5.start.resolve(i43);
                        } else {
                            widgetRun5.end.resolve(i43);
                        }
                        if (i44 < i20 && i44 < i) {
                            if (z) {
                                i43 -= -widgetRun5.end.margin;
                            } else {
                                i43 += -widgetRun5.end.margin;
                            }
                        }
                    }
                }
                return;
            }
            if (i36 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.widget.getHorizontalBiasPercent() : this.widget.getVerticalBiasPercent();
                if (z) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i46 = (int) (((i18 - i4) * horizontalBiasPercent) + 0.5f);
                if (i46 < 0 || i5 > 0) {
                    i46 = i8;
                }
                int i47 = z ? i7 - i46 : i7 + i46;
                for (int i48 = i8; i48 < size; i48++) {
                    WidgetRun widgetRun6 = this.widgets.get(z ? size - (i48 + 1) : i48);
                    if (widgetRun6.widget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i47);
                        widgetRun6.end.resolve(i47);
                    } else {
                        if (i48 > 0 && i48 >= i19) {
                            if (z) {
                                i47 -= widgetRun6.start.margin;
                            } else {
                                i47 += widgetRun6.start.margin;
                            }
                        }
                        if (z) {
                            widgetRun6.end.resolve(i47);
                        } else {
                            widgetRun6.start.resolve(i47);
                        }
                        DimensionDependency dimensionDependency5 = widgetRun6.dimension;
                        int i49 = dimensionDependency5.value;
                        if (widgetRun6.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i49 = dimensionDependency5.wrapValue;
                        }
                        i47 = z ? i47 - i49 : i47 + i49;
                        if (z) {
                            widgetRun6.start.resolve(i47);
                        } else {
                            widgetRun6.end.resolve(i47);
                        }
                        if (i48 < i20 && i48 < i) {
                            if (z) {
                                i47 -= -widgetRun6.end.margin;
                            } else {
                                i47 += -widgetRun6.end.margin;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            this.widgets.get(i).applyToWidget();
        }
    }

    public final ConstraintWidget getFirstVisibleWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    public final ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.widgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.widgets.get(0).widget;
        ConstraintWidget constraintWidget2 = this.widgets.get(size - 1).widget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }
}
