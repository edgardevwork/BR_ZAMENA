package com.blackhub.bronline.game.gui.tuning;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CostCalculation.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "", "()V", "tuningCostTypes", "", "getDetailPrice", "", "typeId", "gosCost", "tuneId", "getFinalCost", "percent", "", "addedValue", "setCost", "mActiveSelectorId", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CostCalculation {
    public static final int $stable = 8;

    @NotNull
    public final int[] tuningCostTypes = {1000, 1000, 500, 600, 1000, 5000, 400, 1000, 1000, 10000, 450, 450, 1000, 1000, 700, 15000, 15000, 15000, 15000, 15000, 50000, 150000, 300, 150000, 10000, 15000, 10000, 0, 50000};

    public final int getFinalCost(int gosCost, double percent, int addedValue) {
        return (int) (((gosCost * percent) / 100) + addedValue);
    }

    public final int getDetailPrice(int typeId, int gosCost, int tuneId) {
        if (typeId == -1) {
            return getFinalCost(gosCost, 8.0d, 15000);
        }
        switch (typeId) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                if (tuneId == 0) {
                    return getFinalCost(gosCost, 4.0d, this.tuningCostTypes[typeId]);
                }
                if (tuneId == 1) {
                    return getFinalCost(gosCost, 7.0d, this.tuningCostTypes[typeId]);
                }
                if (tuneId == 2) {
                    return getFinalCost(gosCost, 5.0d, this.tuningCostTypes[typeId]);
                }
                if (tuneId != 3) {
                    return 0;
                }
                return getFinalCost(gosCost, 0.005d, 20);
            case 20:
                if (tuneId == 0 || tuneId == 1 || tuneId == 2 || tuneId == 3) {
                    return getFinalCost(gosCost, 1.0d, this.tuningCostTypes[typeId]);
                }
                if (tuneId != 4) {
                    return 0;
                }
                return getFinalCost(gosCost, 0.003d, 150);
            case 21:
                return getFinalCost(gosCost, 40.0d, this.tuningCostTypes[typeId]);
            case 22:
                int finalCost = getFinalCost(gosCost, 0.05d, this.tuningCostTypes[typeId]);
                if (finalCost >= 10000) {
                    return 10000;
                }
                return finalCost;
            case 23:
                return getFinalCost(gosCost, 30.0d, this.tuningCostTypes[typeId]);
            case 24:
                return getFinalCost(gosCost, 1.0d, this.tuningCostTypes[typeId]);
            case 25:
                switch (tuneId) {
                    case 1008:
                        return getFinalCost(gosCost, 5.0d, this.tuningCostTypes[typeId]);
                    case 1009:
                        return getFinalCost(gosCost, 2.0d, this.tuningCostTypes[typeId]);
                    case 1010:
                        return getFinalCost(gosCost, 7.0d, this.tuningCostTypes[typeId]);
                    default:
                        return 0;
                }
            case 26:
                return getFinalCost(gosCost, 0.1d, this.tuningCostTypes[typeId]);
            case 27:
                switch (tuneId) {
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        return getFinalCost(gosCost, 7.0d, 100000);
                    case 24:
                    case 25:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        return getFinalCost(gosCost, 0.003d, 350);
                    case 36:
                    case 37:
                        return getFinalCost(gosCost, 15.0d, 150000);
                    default:
                        return 0;
                }
            case 28:
                return getFinalCost(gosCost, 3.0d, this.tuningCostTypes[typeId]);
            default:
                int[] iArr = this.tuningCostTypes;
                if (typeId < iArr.length) {
                    return getFinalCost(gosCost, 1.0d, iArr[typeId]);
                }
                return 0;
        }
    }

    public final int setCost(int mActiveSelectorId, int gosCost) {
        if (mActiveSelectorId != 0 && mActiveSelectorId != 1) {
            if (mActiveSelectorId != 2) {
                if (mActiveSelectorId == 3 || mActiveSelectorId == 4) {
                    return getFinalCost(gosCost, 1.0d, 20000);
                }
                if (mActiveSelectorId != 32) {
                    switch (mActiveSelectorId) {
                        case 10:
                            return getFinalCost(gosCost, 2.0d, 20000);
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (mActiveSelectorId) {
                                case 22:
                                    return getFinalCost(gosCost, 10.0d, 40000);
                                case 23:
                                    return getFinalCost(gosCost, 7.0d, 30000);
                                case 24:
                                case 25:
                                    return getFinalCost(gosCost, 3.0d, 40000);
                                case 26:
                                case 27:
                                    return getFinalCost(gosCost, 5.0d, 40000);
                                case 28:
                                case 29:
                                    return getFinalCost(gosCost, 5.0d, 50000);
                                case 30:
                                    return getFinalCost(gosCost, 7.0d, 100000);
                                default:
                                    return 0;
                            }
                    }
                }
            }
            return getFinalCost(gosCost, 1.0d, 50000);
        }
        return getFinalCost(gosCost, 1.0d, 10000);
    }
}
