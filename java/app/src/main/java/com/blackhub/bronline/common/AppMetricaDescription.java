package com.blackhub.bronline.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppMetricaDictionary.kt */
@StabilityInferred(parameters = 1)
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

