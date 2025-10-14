package com.blackhub.bronline.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppMetricaDictionary.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/common/AppMetricaDescription;", "", "()V", "AFTER_WORK", "", "BOUGHT_ACCESSORY", "BOUGHT_BUSINESS", "BOUGHT_CAR", "BOUGHT_CLOTHES", "BOUGHT_HOUSE", "BOUGHT_SOMETHING_IN_DONATE", "DONATE", "GOT_INCREASE_IN_FRACTION", "JOINED_FAMILY_OR_FRACTION", "OPENED_CASE", "SET_ADMIN", "SET_LEADER", "SUCCESSFULLY_OPENED_CONTAINER", "TASK_COMPLETED", "WON_IN_CASINO", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class AppMetricaDescription {
    public static final int $stable = 0;

    @NotNull
    public static final String AFTER_WORK = "При окончании рабочего дня на подработке, при этом сумма заработка составляет более 30.000 рублей.";

    @NotNull
    public static final String BOUGHT_ACCESSORY = "Если игрок приобрел в магазине аксессуаров предмет дороже 200.000 рублей.";

    @NotNull
    public static final String BOUGHT_BUSINESS = "Купил бизнес";

    @NotNull
    public static final String BOUGHT_CAR = "Купил транспортное средство";

    @NotNull
    public static final String BOUGHT_CLOTHES = "Если игрок приобрел в магазине одежды предмет дороже 300.000 рублей.";

    @NotNull
    public static final String BOUGHT_HOUSE = "Купил дом/квартиру/гараж";

    @NotNull
    public static final String BOUGHT_SOMETHING_IN_DONATE = "Если игрок приобрел в донате скин, аксессуар, услугу или VIP аккаунт стоимостью больше 300 BC.";

    @NotNull
    public static final String DONATE = "Донат от 1000 руб";

    @NotNull
    public static final String GOT_INCREASE_IN_FRACTION = "Получил повышение во фракции через фракционное задание";

    @NotNull
    public static final AppMetricaDescription INSTANCE = new AppMetricaDescription();

    @NotNull
    public static final String JOINED_FAMILY_OR_FRACTION = "Вступил во фракцию или принят в семью";

    @NotNull
    public static final String OPENED_CASE = "Открытие окупаемого кейса";

    @NotNull
    public static final String SET_ADMIN = "Назначение на админку.";

    @NotNull
    public static final String SET_LEADER = "Назначение на лидерку.";

    @NotNull
    public static final String SUCCESSFULLY_OPENED_CONTAINER = "Если игрок открыл контейнер и получил окупной приз.";

    @NotNull
    public static final String TASK_COMPLETED = "Выполнил задание BLACK PASS и попал в окно с получением награды";

    @NotNull
    public static final String WON_IN_CASINO = "Сумма выигрыша ставки в казино больше 50К";
}
