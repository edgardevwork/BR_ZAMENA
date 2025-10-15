package com.blackhub.bronline.game.model.remote.response.blackpass;

import android.content.Context;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LevelsInfo.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a*\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0007\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0007\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0007¨\u0006\u0013"}, m7105d2 = {"getDrawableNameFromAwardId", "", "context", "Landroid/content/Context;", "awardId", "actionWithNativeRender", "", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "action", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "instanceRender", "Lcom/blackhub/bronline/game/GameRender;", "getBitmapFromCDNOrResources", "getTypePathEnum", "Lcom/blackhub/bronline/game/core/enums/ImageTypePathInCDNEnum;", "ifNeedRequestBitmapFromNative", "", "isHaveCDNRender", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class LevelsInfoKt {

    /* compiled from: LevelsInfo.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageTypePathInCDNEnum.values().length];
            try {
                iArr[ImageTypePathInCDNEnum.ACCESSORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageTypePathInCDNEnum.SKIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean ifNeedRequestBitmapFromNative(@NotNull LevelsInfo levelsInfo) {
        Intrinsics.checkNotNullParameter(levelsInfo, "<this>");
        int typeId = levelsInfo.getTypeId();
        return typeId == 11 || typeId == 20;
    }

    public static final boolean isHaveCDNRender(@NotNull LevelsInfo levelsInfo) {
        Intrinsics.checkNotNullParameter(levelsInfo, "<this>");
        return levelsInfo.getRenderId().length() > 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap getBitmapFromCDNOrResources(@NotNull LevelsInfo levelsInfo, @NotNull Context context) {
        Bitmap bitmapDrawableToBitmap;
        Intrinsics.checkNotNullParameter(levelsInfo, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (isHaveCDNRender(levelsInfo)) {
            bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, levelsInfo.getRenderId(), getTypePathEnum(levelsInfo), 0.0f, 0.0f, 24, null);
        } else {
            int typeId = levelsInfo.getTypeId();
            if (typeId == 20) {
                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.discount_accs);
            } else if (typeId != 21) {
                switch (typeId) {
                    case 1:
                        bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_exp.png", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                        break;
                    case 2:
                        bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_prize_money.png", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                        break;
                    case 3:
                        bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_prize_bc.png", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                        break;
                    case 4:
                        int awardId = levelsInfo.getAwardId();
                        if (awardId == 1) {
                            bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_case_daily);
                            break;
                        } else if (awardId == 2) {
                            bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_case_bomj);
                            break;
                        } else if (awardId == 3) {
                            bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_case_standart);
                            break;
                        } else if (awardId == 4) {
                            bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_case_auto);
                            break;
                        } else if (awardId == 5) {
                            bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_case_special);
                            break;
                        } else {
                            bitmapDrawableToBitmap = null;
                            break;
                        }
                    case 5:
                        int awardId2 = levelsInfo.getAwardId();
                        switch (awardId2) {
                            case BlackPassUtils.CAR_AWARD_ID_670 /* 670 */:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_acura_nsk_2023);
                                break;
                            case BlackPassUtils.CAR_AWARD_ID_671 /* 671 */:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_lotus_emira);
                                break;
                            case BlackPassUtils.CAR_AWARD_ID_672 /* 672 */:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_mazda_mx_5_miata);
                                break;
                            case BlackPassUtils.CAR_AWARD_ID_673 /* 673 */:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_toyota_ae86);
                                break;
                            case BlackPassUtils.CAR_AWARD_ID_674 /* 674 */:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_skyline_r32);
                                break;
                            default:
                                switch (awardId2) {
                                    case BlackPassUtils.CAR_AWARD_ID_2402 /* 2402 */:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_car_award_id_2402);
                                        break;
                                    case BlackPassUtils.CAR_AWARD_ID_2403 /* 2403 */:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_car_award_id_2403);
                                        break;
                                    case BlackPassUtils.CAR_AWARD_ID_2404 /* 2404 */:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_car_award_id_2404);
                                        break;
                                    case BlackPassUtils.CAR_AWARD_ID_2405 /* 2405 */:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_car_award_id_2405);
                                        break;
                                    case BlackPassUtils.CAR_AWARD_ID_2406 /* 2406 */:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_car_award_id_2406);
                                        break;
                                    case BlackPassUtils.CAR_AWARD_ID_2407 /* 2407 */:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_car_award_id_2407);
                                        break;
                                    default:
                                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, getDrawableNameFromAwardId(context, levelsInfo.getAwardId()));
                                        break;
                                }
                        }
                    case 6:
                        switch (levelsInfo.getAwardId()) {
                            case 0:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_selchanin);
                                break;
                            case 1:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_bandit);
                                break;
                            case 2:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_yung);
                                break;
                            case 3:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_gangster);
                                break;
                            case 4:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_fred);
                                break;
                            case 5:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_daffna);
                                break;
                            case 6:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_ghost_racer);
                                break;
                            case 7:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_deputat);
                                break;
                            case 8:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_witch);
                                break;
                            case 9:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_smile);
                                break;
                            case 10:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_kruger);
                                break;
                            case 11:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_scream);
                                break;
                            case 12:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_mafiozi);
                                break;
                            case 13:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.packet_mazhor);
                                break;
                            case 14:
                                bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.hw_kostyan);
                                break;
                        }
                    default:
                        switch (typeId) {
                            case 8:
                                bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_coupon_x2.svg", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                                break;
                            case 9:
                                int awardId3 = levelsInfo.getAwardId();
                                if (awardId3 == 1) {
                                    bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.vip_silver);
                                    break;
                                } else if (awardId3 == 2) {
                                    bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.vip_gold);
                                    break;
                                } else if (awardId3 == 3) {
                                    bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(context, R.drawable.vip_platinum);
                                    break;
                                }
                                break;
                            case 10:
                                bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_bpexp.png", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                                break;
                        }
                }
            } else {
                bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_dust.svg", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
            }
        }
        return bitmapDrawableToBitmap == null ? BitmapUtilsKt.drawableToBitmap(context, R.drawable.img_logo_br_big) : bitmapDrawableToBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void actionWithNativeRender(@NotNull LevelsInfo levelsInfo, @NotNull final Function1<? super Bitmap, Unit> action, @Nullable GameRender gameRender) {
        int i;
        int i2;
        float f;
        int count;
        Intrinsics.checkNotNullParameter(levelsInfo, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Float rotX = levelsInfo.getRotX();
        float fFloatValue = rotX != null ? rotX.floatValue() : 20.0f;
        Float rotY = levelsInfo.getRotY();
        float fFloatValue2 = rotY != null ? rotY.floatValue() : 180.0f;
        Float rotZ = levelsInfo.getRotZ();
        float fFloatValue3 = rotZ != null ? rotZ.floatValue() : 45.0f;
        int awardId = levelsInfo.getAwardId();
        int i3 = WhenMappings.$EnumSwitchMapping$0[getTypePathEnum(levelsInfo).ordinal()];
        if (i3 == 1) {
            awardId = levelsInfo.getCount();
            i = 3;
            i2 = 0;
        } else {
            if (i3 == 2) {
                count = levelsInfo.getCount();
                f = 1.0f;
                i = 1;
                i2 = 2;
                if (gameRender == null) {
                    gameRender.RequestRender(i2, levelsInfo.getTypeId(), count, i, i, fFloatValue, fFloatValue2, fFloatValue3, f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfoKt$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                        public final void OnRenderComplete(int i4, Bitmap bitmap) {
                            LevelsInfoKt.actionWithNativeRender$lambda$0(action, i4, bitmap);
                        }
                    });
                    return;
                }
                return;
            }
            i2 = 0;
            i = 0;
        }
        f = 0.9f;
        count = awardId;
        if (gameRender == null) {
        }
    }

    public static final void actionWithNativeRender$lambda$0(Function1 action, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke(bitmap);
    }

    @NotNull
    public static final ImageTypePathInCDNEnum getTypePathEnum(@NotNull LevelsInfo levelsInfo) {
        Intrinsics.checkNotNullParameter(levelsInfo, "<this>");
        if (levelsInfo.getTimeSkin() == 1) {
            return ImageTypePathInCDNEnum.SKIN;
        }
        if ((levelsInfo.getTypeId() == 11 || levelsInfo.getTypeId() == 11) && levelsInfo.getAwardId() == 134) {
            return ImageTypePathInCDNEnum.SKIN;
        }
        if (levelsInfo.getTypeId() == 5 || levelsInfo.getTypeId() == 5) {
            return ImageTypePathInCDNEnum.VEHICLE;
        }
        return ImageTypePathInCDNEnum.ACCESSORY;
    }

    public static final int getDrawableNameFromAwardId(Context context, int i) {
        return context.getResources().getIdentifier("ic_awardid_" + i, "drawable", context.getPackageName());
    }
}
