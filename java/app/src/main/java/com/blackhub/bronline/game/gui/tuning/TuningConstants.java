package com.blackhub.bronline.game.gui.tuning;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiScreenObj;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningConstants.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TuningConstants {
    public static final int ACTION_BUY = 1;
    public static final int ACTION_BUY_COLLAPSE = 4;
    public static final int ACTION_BUY_IN_MAIN_MENU = 6;
    public static final int ACTION_DIAGNOSTIC = 2;
    public static final int ACTION_OPEN_BOX = 3;
    public static final int ACTION_REPAIR = 0;
    public static final int ACTION_SET_DETAIL = 5;
    public static final int APPLY_BUY_IN_MAIN_MENU = 13;

    @NotNull
    public static final String A_KEY_GET_ALL_COLORS = "a";

    @NotNull
    public static final String A_KEY_GET_STATUS_DIAGNOSTIC = "a";
    public static final long BLOCK_TIMER_250 = 250;
    public static final long BLOCK_TIMER_500 = 500;

    @NotNull
    public static final String CAR_ID_JSON = "current_car_id";
    public static final int COLLAPSE_DEFAULT_VALUE = 50;
    public static final int COLLAPSE_TYPE_MENU = 5;
    public static final int COLOR_POS_FOR_SELECTOR_COLOR_BODY = 0;
    public static final int COLOR_POS_FOR_SELECTOR_COLOR_DISCS = 1;
    public static final int COLOR_POS_FOR_SELECTOR_COLOR_LIGHT = 4;
    public static final int COLOR_POS_FOR_SELECTOR_COLOR_NEON_ALL = 5;
    public static final int COLOR_POS_FOR_SELECTOR_COLOR_NEON_LEFT = 6;
    public static final int COLOR_POS_FOR_SELECTOR_COLOR_NEON_RIGHT = 7;
    public static final int COLOR_POS_FOR_SELECTOR_TONING_BACK = 3;
    public static final int COLOR_POS_FOR_SELECTOR_TONING_FRONT = 2;

    @NotNull
    public static final String CO_KEY_SEND_COLOR_FOR_PREVIEW = "co";
    public static final int CURRENCY_BC = 1;
    public static final int CURRENCY_RUB = 0;

    @NotNull
    public static final String DEFAULT_COLOR = "000000";

    @NotNull
    public static final String DEFAULT_COLOR_VALUE = "000000";
    public static final int DEFAULT_INT_VALUE_0 = 0;
    public static final int DEFAULT_INT_VALUE_1 = -1;
    public static final long DEFAULT_LONG_VALUE = 0;
    public static final int DEFAULT_SELECTOR_ID = -1;

    @NotNull
    public static final String DEFAULT_STRING_VALUE = "";

    @NotNull
    public static final String DEFAULT_TRANSPARENCY = "FF";
    public static final int DEF_ALL_CARS = 1;
    public static final long DELAY_AFTER_DIAGNOSTIC = 2100;
    public static final long DELAY_BUTTON_VIEW = 500;
    public static final int DETAILS_LIST_TYPE_MENU = 3;
    public static final int DETAIL_STATUS_BOUGHT = 1;
    public static final int DETAIL_STATUS_CAN_BUY = 0;
    public static final int DETAIL_STATUS_ESTABLISHED = 2;

    @NotNull
    public static final String D_KEY_GET_VALUE_STATUS_DETAIL = "d";

    @NotNull
    public static final String D_KEY_SEND_COLOR_HEX = "d";

    @NotNull
    public static final String D_KEY_SEND_DETAIL_ID = "d";

    @NotNull
    public static final String D_KEY_SEND_DETAIL_ID_OR_COLLAPSE_FOR_PREVIEW = "d";

    @NotNull
    public static final String H_KEY_SEND_COLOR_TRANSPARENCY = "h";

    @NotNull
    public static final String H_KEY_SEND_ID_SOUND = "h";
    public static final int ID_AIR_FILTER = 1;
    public static final int ID_BATTERY_ENGINE = 6;
    public static final int ID_ELECTRONIC_BATTERY = 2;
    public static final int ID_ELECTRONIC_ENGINE = 0;
    public static final int ID_ELECTRONIC_SUSPENSION = 1;
    public static final int ID_ENGINE = 0;
    public static final int ID_FUEL_SYSTEM = 2;
    public static final int ID_SPARK_PLUG = 5;
    public static final int ID_SUSPENSION = 4;
    public static final int ID_TRANSMISSION = 3;

    @NotNull
    public static final String JSON_OBJECT = "local_json_object";

    @NotNull
    public static final String J_KEY_GET_GOS_COST = "j";

    @NotNull
    public static final String K_KEY_GET_DETAILS_LIST_WITH_COST_AND_STATUS = "k";
    public static final int LAYOUT_TUNING_COLLAPSE_AFTER_VIEW_CAR = 14;
    public static final int LAYOUT_TUNING_COLLAPSE_WITH_CLEAR_MENU = 9;
    public static final int LAYOUT_TUNING_COLORS_LIST_AFTER_BACK = 6;
    public static final int LAYOUT_TUNING_COLORS_LIST_AFTER_SUBMENU = 5;
    public static final int LAYOUT_TUNING_COLORS_WITH_RGB_PANEL = 8;
    public static final int LAYOUT_TUNING_DETAILS_LIST_WITH_DATA_CLEANING = 3;
    public static final int LAYOUT_TUNING_DETAILS_LIST_WITH_DATA_RETENTION = 4;
    public static final int LAYOUT_TUNING_DIAGNOSTIC = 12;
    public static final int LAYOUT_TUNING_MAIN = 0;
    public static final int LAYOUT_TUNING_OPENING_BOX = 11;
    public static final int LAYOUT_TUNING_SUBMENU = 2;
    public static final int LAYOUT_TUNING_VIEW_CAR = 1;
    public static final int LAYOUT_TUNING_VIEW_OPTIONS = 10;
    public static final int MAX_STATE_FOR_DETAIL = 100;
    public static final int MAX_VALUE_FOR_BLACK_COIN = 10000;
    public static final int MAX_VALUE_OF_TRANSPARENCY = 100;
    public static final int MIN_SIZE_FOR_PRESENT = 2;
    public static final int MIN_VALUE_OF_TRANSPARENCY = 0;

    @NotNull
    public static final String MT_KEY_SEND_TYPE_OF_DETAIL = "mt";

    @NotNull
    public static final String M_KEY_GET_PLAYERS_MONEY = "m";

    @NotNull
    public static final String M_KEY_SEND_SELECTOR_ID = "m";

    @NotNull
    public static final String N_KEY_GET_CAR_NAME = "n";
    public static final int OPERATION_BUY_COLLAPSE = 12;
    public static final int OPERATION_BUY_COLOR = 1;
    public static final int OPERATION_BUY_COLOR_WITH_TRANSPARENCY = 2;
    public static final int OPERATION_BUY_DETAIL = 7;
    public static final int OPERATION_BUY_VINYL = 3;
    public static final int OPERATION_CHECK_FOR_REPAIR_DETAIL = 9;
    public static final int OPERATION_CLOSE_DOOR = 14;
    public static final int OPERATION_CLOSE_MENU = 0;
    public static final int OPERATION_CLOSE_VIEW_CAR = 17;
    public static final int OPERATION_DELETE_DETAILS = 18;
    public static final int OPERATION_DIAGNOSTIC = 6;
    public static final int OPERATION_GET_COLLAPSE = 28;
    public static final int OPERATION_GET_GAME_WARNING = 4;
    public static final int OPERATION_GET_NEW_LIST_COLORS = 20;
    public static final int OPERATION_GET_START_VINYLS = 26;
    public static final int OPERATION_INSTALL_DETAIL = 10;
    public static final int OPERATION_LISTEN_SOUND = 29;
    public static final int OPERATION_OPEN_BOX = 11;
    public static final int OPERATION_OPEN_DOOR = 13;
    public static final int OPERATION_PREVIEW_COLLAPSE = 24;
    public static final int OPERATION_PREVIEW_COLOR = 23;
    public static final int OPERATION_PREVIEW_DETAIL = 22;
    public static final int OPERATION_PREVIEW_VINYL = 25;
    public static final int OPERATION_REPAIR_DETAIL = 8;
    public static final int OPERATION_RESET_DETAILS = 5;
    public static final int OPERATION_SAVE_ACTUAL_CAR = 19;
    public static final int OPERATION_SET_CAMERA_FOR_SELECTOR = 21;
    public static final int OPERATION_TURN_OFF_LIGHT = 16;
    public static final int OPERATION_TURN_ON_LIGHT = 15;
    public static final int OPERATION_VIEW_CAR = 27;
    public static final int OTHER_TYPE_MENU = 0;
    public static final int POS_ID_IN_JSON_ARR = 0;
    public static final int POS_LOCATION_IN_JSON_ARR = 1;
    public static final int POS_WITH_COLLAPSE_BACK = 5;
    public static final int POS_WITH_COLLAPSE_FRONT = 4;
    public static final int POS_WITH_DEPARTURE_BACK_WHEELS = 3;
    public static final int POS_WITH_DEPARTURE_FRONT_WHEELS = 2;
    public static final int POS_WITH_FULL_CLEARANCE = 0;
    public static final int POS_WITH_INDIVIDUAL_CLEARANCE = 1;
    public static final int POS_WITH_NAME = 0;
    public static final int POS_WITH_RADIUS_WHEELS = 8;
    public static final int POS_WITH_TYPE = 1;
    public static final int POS_WITH_WIDTH_BACK_WHEELS = 7;
    public static final int POS_WITH_WIDTH_FRONT_WHEELS = 6;

    @NotNull
    public static final String P_KEY_GET_ID_DETAIL = "p";
    public static final int READY_COLOR_TYPE_MENU = 2;
    public static final int RGB_TYPE_MENU = 1;

    @NotNull
    public static final String R_KEY_GET_OLD_INSTALL_DETAIL = "r";
    public static final int SCREEN_TIRE_CENTRE = 2;
    public static final int SELECTOR_AIR_FILTER = 38;
    public static final int SELECTOR_BRAKERS = 37;
    public static final int SELECTOR_BUMPER = 17;
    public static final int SELECTOR_BUMPER_GRILL = 46;
    public static final int SELECTOR_COLLAPSE_BACK = 27;
    public static final int SELECTOR_COLLAPSE_FRONT = 26;
    public static final int SELECTOR_COLOR_BODY = 0;
    public static final int SELECTOR_COLOR_DISCS_1 = 1;
    public static final int SELECTOR_COLOR_DISCS_2 = 32;
    public static final int SELECTOR_COLOR_LIGHT = 10;
    public static final int SELECTOR_COLOR_NEON_ALL = 11;
    public static final int SELECTOR_COLOR_NEON_LEFT = 12;
    public static final int SELECTOR_COLOR_NEON_RIGHT = 13;
    public static final int SELECTOR_DEPARTURE_BACK_WHEELS = 25;
    public static final int SELECTOR_DEPARTURE_FRONT_WHEELS = 24;
    public static final int SELECTOR_DIFFERENTIAL = 36;
    public static final int SELECTOR_DISCS = 31;
    public static final int SELECTOR_ENGINE = 39;
    public static final int SELECTOR_EXHAUST_SOUND = 9;
    public static final int SELECTOR_FENDER_EXTENSION = 45;
    public static final int SELECTOR_FULL_CLEARANCE = 22;
    public static final int SELECTOR_HOOD = 43;
    public static final int SELECTOR_HORN = 7;
    public static final int SELECTOR_INDIVIDUAL_CLEARANCE = 23;

    @NotNull
    public static final String SELECTOR_JSON = "current_selector";
    public static final int SELECTOR_MUFFLER = 19;
    public static final int SELECTOR_RADIUS_WHEELS = 30;
    public static final int SELECTOR_ROOF = 21;
    public static final int SELECTOR_SECOND_SPOILER = 47;
    public static final int SELECTOR_SPINNING_DISCS = 33;
    public static final int SELECTOR_SPLITTER = 20;
    public static final int SELECTOR_SPOILER = 16;
    public static final int SELECTOR_STROBOSCOPE = 14;
    public static final int SELECTOR_SUPERCHARGER = 40;
    public static final int SELECTOR_THRESHOLDS = 18;
    public static final int SELECTOR_TONING_BACK = 4;
    public static final int SELECTOR_TONING_FRONT = 3;
    public static final int SELECTOR_TRUNK = 44;
    public static final int SELECTOR_VINYL = 2;
    public static final int SELECTOR_WIDTH_BACK_WHEELS = 29;
    public static final int SELECTOR_WIDTH_FRONT_WHEELS = 28;
    public static final int SIZE_COLOR_POS_FOR_SELECTOR = 8;
    public static final int SIZE_OF_COLLAPSES = 9;
    public static final int SIZE_WITH_COST_ARR = 7;
    public static final int STATUS_ACTUAL_DIAGNOSTIC = 1;
    public static final int STATUS_FALSE = 0;
    public static final int STATUS_NOT_ACTUAL_DIAGNOSTIC = 0;
    public static final int STATUS_TRUE = 1;
    public static final int STEP_IN_JSON_ARR = 2;

    @NotNull
    public static final String S_KEY_GET_CAR_ID = "s";

    @NotNull
    public static final String S_KEY_GET_STATUS_OPERATION = "s";

    @NotNull
    public static final String S_KEY_SEND_SELECTOR_FOR_PREVIEW = "s";

    @NotNull
    public static final String TITLE_JSON = "current_title";
    public static final int TYPE_BOX = -1;

    @NotNull
    public static final String T_KEY_ACTION_TYPE = "t";

    @NotNull
    public static final String U_KEY_GET_ALL_COLLAPSE = "u";
    public static final long VALUE_OF_DELAY_100 = 100;
    public static final long VALUE_OF_DELAY_250 = 250;
    public static final int VINYLS_LIST_TYPE_MENU = 4;

    @NotNull
    public static final String V_KEY_GET_VINYL = "v";

    @NotNull
    public static final String V_KEY_SEND_VINYL_NAME = "v";

    @NotNull
    public static final String W_KEY_GET_WINDOW = "w";

    @Nullable
    public static TuneGuiScreenObj currentActiveScreen;

    @NotNull
    public static final TuningConstants INSTANCE = new TuningConstants();

    @NotNull
    public static final List<Integer> activeSelectorListForPreview = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 14, 16, 17, 18, 19, 20, 21, 31, 33, 43, 44, 45, 46, 47});

    @NotNull
    public static final List<Integer> activeSelectorListForInfoBrake = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{36, 37, 38, 39, 40});

    @NotNull
    public static final List<Integer> activeSelectorListForSoundPlay = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{7, 9});
    public static final int ID_TESLA_MODEL_X = 2543;
    public static final int ID_TESLA_MODEL_S = 2544;
    public static final int ID_PORSCHE_TAYCAN = 2581;
    public static final int ID_MERCEDES_EQS = 2590;

    @NotNull
    public static final List<Integer> electronicCars = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(ID_TESLA_MODEL_X), Integer.valueOf(ID_TESLA_MODEL_S), Integer.valueOf(ID_PORSCHE_TAYCAN), Integer.valueOf(ID_MERCEDES_EQS)});

    @NotNull
    public static final List<String> resForElectronicCars = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"t_battery_icon", "t_brakers_icon", "t_transmission_icon", "t_electro_engine_icon", "t_chip_icon"});

    @NotNull
    public static final List<String> resForDVSCars = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"t_differential_icon", "t_brakers_icon", "t_air_filter_icon", "t_engine_icon", "t_supercharger_icon"});

    @NotNull
    public static final List<String> titleItemForElectronicCars = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Батарея", "Тормоза", "Трансмиссия", "Электродвигатель", "Контроллер"});

    @NotNull
    public static final List<String> titleItemsForDVSCars = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Дифференциал", "Тормоза", "Турбонаддув", "Двигатель", "Нагнетатель"});

    @NotNull
    public static final List<Integer> carIdWithoutVinyls = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{402, Integer.valueOf(HttpStatus.SC_GONE), Integer.valueOf(HttpStatus.SC_LENGTH_REQUIRED), Integer.valueOf(HttpStatus.SC_REQUEST_TOO_LONG), Integer.valueOf(HttpStatus.SC_REQUEST_URI_TOO_LONG), Integer.valueOf(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE), 416, 427, Integer.valueOf(HttpStatus.SC_TOO_MANY_REQUESTS), 433, 436, 438, 440, 445, 456, 459, 462, Integer.valueOf(FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH), 480, 490, 494, 495, 502, 503, 505, 526, 540, 541, 559, 565, 579, 587, 589, Integer.valueOf(TypedValues.MotionType.TYPE_EASING), Integer.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR)});
    public static final int $stable = 8;

    @NotNull
    public final List<Integer> getActiveSelectorListForPreview() {
        return activeSelectorListForPreview;
    }

    @NotNull
    public final List<Integer> getActiveSelectorListForInfoBrake() {
        return activeSelectorListForInfoBrake;
    }

    @NotNull
    public final List<Integer> getActiveSelectorListForSoundPlay() {
        return activeSelectorListForSoundPlay;
    }

    @NotNull
    public final List<Integer> getElectronicCars() {
        return electronicCars;
    }

    @NotNull
    public final List<String> getResForElectronicCars() {
        return resForElectronicCars;
    }

    @NotNull
    public final List<String> getResForDVSCars() {
        return resForDVSCars;
    }

    @NotNull
    public final List<String> getTitleItemForElectronicCars() {
        return titleItemForElectronicCars;
    }

    @NotNull
    public final List<String> getTitleItemsForDVSCars() {
        return titleItemsForDVSCars;
    }

    @NotNull
    public final List<Integer> getCarIdWithoutVinyls() {
        return carIdWithoutVinyls;
    }

    @Nullable
    public final TuneGuiScreenObj getCurrentActiveScreen() {
        return currentActiveScreen;
    }

    public final void setCurrentActiveScreen(@Nullable TuneGuiScreenObj tuneGuiScreenObj) {
        currentActiveScreen = tuneGuiScreenObj;
    }
}

