package com.thoughtworks.xstream.p042io.xml;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.SefReader;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapterKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate;
import com.google.android.material.snackbar.SnackbarManager;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorBuilder;

/* loaded from: classes5.dex */
public class XmlFriendlyNameCoder implements NameCoder, Cloneable {
    public static final BitSet XML_NAME_CHARS;
    public static final BitSet XML_NAME_START_CHARS;
    public final String dollarReplacement;
    public transient Map escapeCache;
    public final String escapeCharReplacement;
    public final String hexPrefix;
    public transient Map unescapeCache;

    static {
        BitSet bitSet = new BitSet(1048575);
        bitSet.set(58);
        bitSet.set(95);
        bitSet.set(65, 91);
        bitSet.set(97, 123);
        bitSet.set(192, MatroskaExtractor.ID_TRACK_NUMBER);
        bitSet.set(216, 247);
        BitSet bitSet2 = (BitSet) bitSet.clone();
        bitSet.set(SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 306);
        bitSet.set(308, 319);
        bitSet.set(321, 329);
        bitSet.set(330, 383);
        bitSet.set(384, 452);
        bitSet.set(461, 497);
        bitSet.set(461, 497);
        bitSet.set(500, 502);
        bitSet.set(TypedValues.PositionType.TYPE_PERCENT_X, 536);
        bitSet.set(592, 681);
        bitSet.set(DonateHeaderOrFooterAdapterKt.SCREEN_SIZE_MAX_2, TypedValues.TransitionType.TYPE_STAGGERED);
        bitSet.set(TypedValues.Custom.TYPE_COLOR);
        bitSet.set(TypedValues.Custom.TYPE_BOOLEAN, 907);
        bitSet.set(908);
        bitSet.set(910, 930);
        bitSet.set(931, 975);
        bitSet.set(976, 983);
        bitSet.set(986);
        bitSet.set(988);
        bitSet.set(990);
        bitSet.set(992);
        bitSet.set(994, 1012);
        bitSet.set(1025, 1037);
        bitSet.set(1038, 1104);
        bitSet.set(1105, 1117);
        bitSet.set(1118, 1154);
        bitSet.set(1168, 1221);
        bitSet.set(1223, 1225);
        bitSet.set(1227, 1229);
        bitSet.set(1232, 1260);
        bitSet.set(1262, 1270);
        bitSet.set(1272, 1274);
        bitSet.set(1329, 1367);
        bitSet.set(1369);
        bitSet.set(1377, 1415);
        bitSet.set(1488, 1515);
        bitSet.set(CircularIndeterminateAnimatorDelegate.CONSTANT_ROTATION_DEGREES, 1523);
        bitSet.set(1569, 1595);
        bitSet.set(1601, 1611);
        bitSet.set(1649, 1720);
        bitSet.set(1722, 1727);
        bitSet.set(1728, 1743);
        bitSet.set(1744, 1748);
        bitSet.set(1749);
        bitSet.set(1765, 1767);
        bitSet.set(2309, 2362);
        bitSet.set(2365);
        bitSet.set(2392, BlackPassUtils.CAR_AWARD_ID_2402);
        bitSet.set(2437, 2445);
        bitSet.set(2447, 2449);
        bitSet.set(2451, 2473);
        bitSet.set(2474, 2481);
        bitSet.set(2482);
        bitSet.set(2486, 2490);
        bitSet.set(2524, 2526);
        bitSet.set(2527, 2530);
        bitSet.set(TuningConstants.ID_TESLA_MODEL_S, 2546);
        bitSet.set(2565, 2571);
        bitSet.set(2575, 2577);
        bitSet.set(2579, 2601);
        bitSet.set(2602, 2609);
        bitSet.set(2610, 2612);
        bitSet.set(2613, 2615);
        bitSet.set(2616, 2618);
        bitSet.set(2649, 2653);
        bitSet.set(2654);
        bitSet.set(2674, 2677);
        bitSet.set(2693, 2700);
        bitSet.set(2701);
        bitSet.set(2703, 2706);
        bitSet.set(2707, 2729);
        bitSet.set(2730, 2737);
        bitSet.set(2738, 2740);
        bitSet.set(2741, 2746);
        bitSet.set(2749);
        bitSet.set(2784);
        bitSet.set(2821, 2829);
        bitSet.set(2831, 2833);
        bitSet.set(2835, 2857);
        bitSet.set(2858, 2865);
        bitSet.set(2866, 2868);
        bitSet.set(2870, 2874);
        bitSet.set(2877);
        bitSet.set(2908, 2910);
        bitSet.set(2911, 2914);
        bitSet.set(2949, 2955);
        bitSet.set(2958, 2961);
        bitSet.set(2962, 2966);
        bitSet.set(2969, 2971);
        bitSet.set(2972);
        bitSet.set(2974, 2976);
        bitSet.set(2979, 2981);
        bitSet.set(2984, 2987);
        bitSet.set(2990, 2998);
        bitSet.set(2999, PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED);
        bitSet.set(3077, 3085);
        bitSet.set(3086, 3089);
        bitSet.set(3090, 3113);
        bitSet.set(3114, 3124);
        bitSet.set(3125, 3130);
        bitSet.set(3168, 3170);
        bitSet.set(3205, 3213);
        bitSet.set(3214, 3217);
        bitSet.set(3218, 3241);
        bitSet.set(3242, 3252);
        bitSet.set(3253, 3258);
        bitSet.set(3294);
        bitSet.set(3296, 3298);
        bitSet.set(3333, 3341);
        bitSet.set(3342, 3345);
        bitSet.set(3346, 3369);
        bitSet.set(3370, 3386);
        bitSet.set(3424, 3426);
        bitSet.set(3585, 3631);
        bitSet.set(3632);
        bitSet.set(3634, 3636);
        bitSet.set(3648, 3654);
        bitSet.set(3713, 3715);
        bitSet.set(3716);
        bitSet.set(3719, 3721);
        bitSet.set(3722);
        bitSet.set(3725);
        bitSet.set(3732, 3736);
        bitSet.set(3737, 3744);
        bitSet.set(3745, 3748);
        bitSet.set(3749);
        bitSet.set(3751);
        bitSet.set(3754, 3756);
        bitSet.set(3757, 3759);
        bitSet.set(3760);
        bitSet.set(3762, 3764);
        bitSet.set(3773);
        bitSet.set(3776, 3781);
        bitSet.set(3904, 3912);
        bitSet.set(3913, 3946);
        bitSet.set(4256, 4294);
        bitSet.set(4304, 4343);
        bitSet.set(4352);
        bitSet.set(4354, 4356);
        bitSet.set(4357, 4360);
        bitSet.set(4361);
        bitSet.set(4363, 4365);
        bitSet.set(4366, 4371);
        bitSet.set(4412);
        bitSet.set(4414);
        bitSet.set(4416);
        bitSet.set(4428);
        bitSet.set(4430);
        bitSet.set(4432);
        bitSet.set(4436, 4438);
        bitSet.set(4441);
        bitSet.set(4447, 4450);
        bitSet.set(4451);
        bitSet.set(4453);
        bitSet.set(4455);
        bitSet.set(4457);
        bitSet.set(4461, 4463);
        bitSet.set(4466, 4468);
        bitSet.set(4469);
        bitSet.set(4510);
        bitSet.set(4520);
        bitSet.set(4523);
        bitSet.set(4526, 4528);
        bitSet.set(4535, 4537);
        bitSet.set(4538);
        bitSet.set(4540, 4547);
        bitSet.set(4587);
        bitSet.set(4592);
        bitSet.set(4601);
        bitSet.set(7680, 7836);
        bitSet.set(7840, 7930);
        bitSet.set(7936, 7958);
        bitSet.set(7960, 7966);
        bitSet.set(7968, 8006);
        bitSet.set(8008, 8014);
        bitSet.set(8016, IOUtils.COPY_BUF_SIZE);
        bitSet.set(8025);
        bitSet.set(8027);
        bitSet.set(8029);
        bitSet.set(8031, 8062);
        bitSet.set(8064, 8117);
        bitSet.set(8118, 8125);
        bitSet.set(8126);
        bitSet.set(8130, 8133);
        bitSet.set(8134, 8141);
        bitSet.set(8144, 8148);
        bitSet.set(8150, 8156);
        bitSet.set(8160, 8173);
        bitSet.set(8178, 8181);
        bitSet.set(8182, 8189);
        bitSet.set(8486);
        bitSet.set(8490, 8492);
        bitSet.set(8494);
        bitSet.set(8576, 8579);
        bitSet.set(12353, 12437);
        bitSet.set(12449, 12539);
        bitSet.set(12549, 12589);
        bitSet.set(12295);
        bitSet.set(12321, 12330);
        bitSet.set(19968, 40870);
        bitSet.set(44032, 55204);
        bitSet2.set(SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER, 768);
        bitSet2.set(880, 894);
        bitSet2.set(895, 8192);
        bitSet2.set(8204, 8206);
        bitSet2.set(8304, 8592);
        bitSet2.set(11264, 12272);
        bitSet2.set(12289, 55296);
        bitSet2.set(63744, 64976);
        bitSet2.set(65008, 65534);
        bitSet2.set(65536, 983040);
        BitSet bitSet3 = new BitSet(1048575);
        bitSet3.set(45);
        bitSet3.set(46);
        bitSet3.set(48, 58);
        bitSet3.set(MatroskaExtractor.ID_CUE_TRACK_POSITIONS);
        BitSet bitSet4 = (BitSet) bitSet3.clone();
        bitSet3.or(bitSet);
        bitSet3.set(720);
        bitSet3.set(721);
        bitSet3.set(768, 838);
        bitSet3.set(864, 866);
        bitSet3.set(TypedValues.Custom.TYPE_STRING);
        bitSet3.set(1155, 1159);
        bitSet3.set(1425, 1442);
        bitSet3.set(1443, 1466);
        bitSet3.set(1467, 1470);
        bitSet3.set(1471);
        bitSet3.set(1473, 1475);
        bitSet3.set(1476);
        bitSet3.set(1600);
        bitSet3.set(1611, 1619);
        bitSet3.set(1632, 1642);
        bitSet3.set(1648);
        bitSet3.set(1750, 1757);
        bitSet3.set(1757, 1760);
        bitSet3.set(1760, 1765);
        bitSet3.set(1767, 1769);
        bitSet3.set(1770, 1774);
        bitSet3.set(1776, 1786);
        bitSet3.set(2305, 2308);
        bitSet3.set(2364);
        bitSet3.set(2366, 2381);
        bitSet3.set(2381);
        bitSet3.set(2385, 2389);
        bitSet3.set(BlackPassUtils.CAR_AWARD_ID_2402, BlackPassUtils.CAR_AWARD_ID_2404);
        bitSet3.set(BlackPassUtils.CAR_AWARD_ID_2406, 2416);
        bitSet3.set(2433, 2436);
        bitSet3.set(2492);
        bitSet3.set(2494);
        bitSet3.set(2495);
        bitSet3.set(2496, 2501);
        bitSet3.set(2503, 2505);
        bitSet3.set(2507, 2510);
        bitSet3.set(2519);
        bitSet3.set(2530, 2532);
        bitSet3.set(2534, TuningConstants.ID_TESLA_MODEL_S);
        bitSet3.set(2562);
        bitSet3.set(2620);
        bitSet3.set(2622);
        bitSet3.set(2623);
        bitSet3.set(2624, 2627);
        bitSet3.set(2631, 2633);
        bitSet3.set(2635, 2638);
        bitSet3.set(2662, 2672);
        bitSet3.set(2672, 2674);
        bitSet3.set(2689, 2692);
        bitSet3.set(2748);
        bitSet3.set(SnackbarManager.LONG_DURATION_MS, 2758);
        bitSet3.set(2759, 2762);
        bitSet3.set(2763, 2766);
        bitSet3.set(2790, 2800);
        bitSet3.set(SefReader.TYPE_SUPER_SLOW_MOTION_BGM, SefReader.TYPE_SUPER_SLOW_DEFLICKERING_ON);
        bitSet3.set(2876);
        bitSet3.set(2878, 2884);
        bitSet3.set(2887, 2889);
        bitSet3.set(2891, 2894);
        bitSet3.set(2902, 2904);
        bitSet3.set(2918, 2928);
        bitSet3.set(2946, 2948);
        bitSet3.set(3006, 3011);
        bitSet3.set(3014, 3017);
        bitSet3.set(3018, 3022);
        bitSet3.set(3031);
        bitSet3.set(3047, 3056);
        bitSet3.set(3073, 3076);
        bitSet3.set(3134, 3141);
        bitSet3.set(3142, 3145);
        bitSet3.set(3146, 3150);
        bitSet3.set(3157, 3159);
        bitSet3.set(3174, 3184);
        bitSet3.set(3202, 3204);
        bitSet3.set(3262, 3269);
        bitSet3.set(3270, 3273);
        bitSet3.set(3274, 3278);
        bitSet3.set(3285, 3287);
        bitSet3.set(3302, 3312);
        bitSet3.set(3330, 3332);
        bitSet3.set(3390, 3396);
        bitSet3.set(3398, 3401);
        bitSet3.set(3402, 3406);
        bitSet3.set(3415);
        bitSet3.set(3430, 3440);
        bitSet3.set(3633);
        bitSet3.set(3636, 3643);
        bitSet3.set(3654);
        bitSet3.set(3655, 3663);
        bitSet3.set(3664, 3674);
        bitSet3.set(3761);
        bitSet3.set(3764, 3770);
        bitSet3.set(3771, 3773);
        bitSet3.set(3782);
        bitSet3.set(3784, 3790);
        bitSet3.set(3792, 3802);
        bitSet3.set(3864, 3866);
        bitSet3.set(3872, 3882);
        bitSet3.set(3893);
        bitSet3.set(3895);
        bitSet3.set(3897);
        bitSet3.set(3902);
        bitSet3.set(3903);
        bitSet3.set(3953, 3973);
        bitSet3.set(3974, 3980);
        bitSet3.set(3984, 3990);
        bitSet3.set(3991);
        bitSet3.set(3993, 4014);
        bitSet3.set(4017, 4024);
        bitSet3.set(4025);
        bitSet3.set(8400, 8413);
        bitSet3.set(8417);
        bitSet3.set(12293);
        bitSet3.set(12330, 12336);
        bitSet3.set(12337, 12342);
        bitSet3.set(12441);
        bitSet3.set(12442);
        bitSet3.set(GlUtil.EGL_GL_COLORSPACE_KHR, 12447);
        bitSet3.set(12540, 12543);
        bitSet4.or(bitSet2);
        bitSet4.set(768, 880);
        bitSet4.set(8255, 8257);
        BitSet bitSet5 = (BitSet) bitSet.clone();
        XML_NAME_START_CHARS = bitSet5;
        bitSet5.and(bitSet2);
        BitSet bitSet6 = (BitSet) bitSet3.clone();
        XML_NAME_CHARS = bitSet6;
        bitSet6.and(bitSet4);
    }

    public XmlFriendlyNameCoder() {
        this("_-", PomModuleDescriptorBuilder.EXTRA_INFO_DELIMITER);
    }

    public XmlFriendlyNameCoder(String str, String str2) {
        this(str, str2, "_.");
    }

    public XmlFriendlyNameCoder(String str, String str2, String str3) {
        this.dollarReplacement = str;
        this.escapeCharReplacement = str2;
        this.hexPrefix = str3;
        readResolve();
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeAttribute(String str) {
        return decodeName(str);
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeNode(String str) {
        return decodeName(str);
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeAttribute(String str) {
        return encodeName(str);
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeNode(String str) {
        return encodeName(str);
    }

    public final String encodeName(String str) {
        String str2 = (String) this.escapeCache.get(str);
        if (str2 != null) {
            return str2;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 'A' || ((cCharAt > 'Z' && cCharAt < 'a') || cCharAt > 'z')) {
                break;
            }
            i++;
        }
        if (i == length) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(length + 8);
        if (i > 0) {
            stringBuffer.append(str.substring(0, i));
        }
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == '$') {
                stringBuffer.append(this.dollarReplacement);
            } else if (cCharAt2 == '_') {
                stringBuffer.append(this.escapeCharReplacement);
            } else if ((i == 0 && !isXmlNameStartChar(cCharAt2)) || (i > 0 && !isXmlNameChar(cCharAt2))) {
                stringBuffer.append(this.hexPrefix);
                if (cCharAt2 < 16) {
                    stringBuffer.append("000");
                } else if (cCharAt2 < 256) {
                    stringBuffer.append("00");
                } else if (cCharAt2 < 4096) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(cCharAt2));
            } else {
                stringBuffer.append(cCharAt2);
            }
            i++;
        }
        String string = stringBuffer.toString();
        this.escapeCache.put(str, string);
        return string;
    }

    public final String decodeName(String str) {
        String str2 = (String) this.unescapeCache.get(str);
        if (str2 != null) {
            return str2;
        }
        char cCharAt = this.dollarReplacement.charAt(0);
        char cCharAt2 = this.escapeCharReplacement.charAt(0);
        char cCharAt3 = this.hexPrefix.charAt(0);
        int length = str.length();
        int length2 = 0;
        while (length2 < length) {
            char cCharAt4 = str.charAt(length2);
            if (cCharAt4 == cCharAt || cCharAt4 == cCharAt2 || cCharAt4 == cCharAt3) {
                break;
            }
            length2++;
        }
        if (length2 == length) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(length + 8);
        if (length2 > 0) {
            stringBuffer.append(str.substring(0, length2));
        }
        while (length2 < length) {
            char cCharAt5 = str.charAt(length2);
            if (cCharAt5 == cCharAt && str.startsWith(this.dollarReplacement, length2)) {
                length2 += this.dollarReplacement.length() - 1;
                stringBuffer.append('$');
            } else if (cCharAt5 == cCharAt3 && str.startsWith(this.hexPrefix, length2)) {
                int length3 = length2 + this.hexPrefix.length();
                char c = (char) Integer.parseInt(str.substring(length3, length3 + 4), 16);
                length2 = length3 + 3;
                stringBuffer.append(c);
            } else if (cCharAt5 == cCharAt2 && str.startsWith(this.escapeCharReplacement, length2)) {
                length2 += this.escapeCharReplacement.length() - 1;
                stringBuffer.append(LauncherConstants.UNDERSCORE_CHAR);
            } else {
                stringBuffer.append(cCharAt5);
            }
            length2++;
        }
        String string = stringBuffer.toString();
        this.unescapeCache.put(str, string);
        return string;
    }

    public Object clone() {
        try {
            XmlFriendlyNameCoder xmlFriendlyNameCoder = (XmlFriendlyNameCoder) super.clone();
            xmlFriendlyNameCoder.readResolve();
            return xmlFriendlyNameCoder;
        } catch (CloneNotSupportedException e) {
            throw new ObjectAccessException("Cannot clone XmlFriendlyNameCoder", e);
        }
    }

    private Object readResolve() {
        this.escapeCache = createCacheMap();
        this.unescapeCache = createCacheMap();
        return this;
    }

    public Map createCacheMap() {
        return new HashMap();
    }

    public static boolean isXmlNameStartChar(int i) {
        return XML_NAME_START_CHARS.get(i);
    }

    public static boolean isXmlNameChar(int i) {
        return XML_NAME_CHARS.get(i);
    }
}
