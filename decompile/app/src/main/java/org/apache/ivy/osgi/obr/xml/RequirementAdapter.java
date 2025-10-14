package org.apache.ivy.osgi.obr.xml;

import java.text.ParseException;
import java.util.Iterator;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.BundleRequirement;
import org.apache.ivy.osgi.filter.AndFilter;
import org.apache.ivy.osgi.filter.CompareFilter;
import org.apache.ivy.osgi.filter.NotFilter;
import org.apache.ivy.osgi.filter.OSGiFilter;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.osgi.util.VersionRange;

/* loaded from: classes5.dex */
public class RequirementAdapter {
    public Version startVersion = null;
    public boolean startExclusive = false;
    public Version endVersion = null;
    public boolean endExclusive = false;
    public String type = null;
    public String name = null;

    public static void adapt(BundleInfo bundleInfo, Requirement requirement) throws ParseException, UnsupportedFilterException {
        RequirementAdapter requirementAdapter = new RequirementAdapter();
        requirementAdapter.extractFilter(requirement.getFilter());
        requirementAdapter.adapt(bundleInfo, requirement.isOptional());
    }

    public final void extractFilter(OSGiFilter oSGiFilter) throws UnsupportedFilterException {
        if (oSGiFilter instanceof AndFilter) {
            Iterator<OSGiFilter> it = ((AndFilter) oSGiFilter).getSubFilters().iterator();
            while (it.hasNext()) {
                extractFilter(it.next());
            }
        } else {
            if (oSGiFilter instanceof CompareFilter) {
                parseCompareFilter((CompareFilter) oSGiFilter, false);
                return;
            }
            if (oSGiFilter instanceof NotFilter) {
                NotFilter notFilter = (NotFilter) oSGiFilter;
                if (notFilter.getSubFilter() instanceof CompareFilter) {
                    parseCompareFilter((CompareFilter) notFilter.getSubFilter(), true);
                    return;
                }
                return;
            }
            throw new UnsupportedFilterException("Unsupported filter: " + oSGiFilter.getClass().getName());
        }
    }

    public final void adapt(BundleInfo bundleInfo, boolean z) throws ParseException {
        VersionRange versionRange = getVersionRange();
        String str = z ? "optional" : null;
        String str2 = this.type;
        if (str2 == null) {
            throw new ParseException("No requirement actually specified", 0);
        }
        bundleInfo.addRequirement(new BundleRequirement(str2, this.name, versionRange, str));
        if ("ee".equals(this.type)) {
            bundleInfo.addExecutionEnvironment(this.name);
        }
    }

    public final VersionRange getVersionRange() {
        Version version = this.startVersion;
        if (version == null && this.endVersion == null) {
            return null;
        }
        return new VersionRange(this.startExclusive, version, this.endExclusive, this.endVersion);
    }

    public final void parseCompareFilter(CompareFilter compareFilter, boolean z) throws UnsupportedFilterException {
        String leftValue;
        leftValue = compareFilter.getLeftValue();
        if (OBRXMLParser.ResourceHandler.SYMBOLIC_NAME.equals(leftValue)) {
            leftValue = BundleInfo.BUNDLE_TYPE;
        }
        leftValue.hashCode();
        switch (leftValue) {
            case "bundle":
            case "package":
            case "ee":
            case "service":
                if (z) {
                    throw new UnsupportedFilterException("Not filter on requirement comparison is not supported");
                }
                if (compareFilter.getOperator() != CompareFilter.Operator.EQUALS) {
                    throw new UnsupportedFilterException("Filtering is only supported with the operator '='");
                }
                if (this.type != null) {
                    throw new UnsupportedFilterException("Multiple requirement type are not supported");
                }
                this.type = leftValue;
                this.name = compareFilter.getRightValue();
                return;
            case "version":
                Version version = new Version(compareFilter.getRightValue());
                CompareFilter.Operator operator = compareFilter.getOperator();
                if (z) {
                    int i = C111841.$SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[operator.ordinal()];
                    if (i == 1) {
                        throw new UnsupportedFilterException("Not filter on equals comparison is not supported");
                    }
                    if (i == 2) {
                        operator = CompareFilter.Operator.LOWER_THAN;
                    } else if (i == 3) {
                        operator = CompareFilter.Operator.LOWER_OR_EQUAL;
                    } else if (i == 4) {
                        operator = CompareFilter.Operator.GREATER_THAN;
                    } else if (i == 5) {
                        operator = CompareFilter.Operator.GREATER_OR_EQUAL;
                    }
                }
                int i2 = C111841.$SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[operator.ordinal()];
                if (i2 == 1) {
                    if (this.startVersion != null || this.endVersion != null) {
                        throw new UnsupportedFilterException("Multiple version matching is not supported");
                    }
                    this.startVersion = version;
                    this.startExclusive = false;
                    this.endVersion = version;
                    this.endExclusive = false;
                    return;
                }
                if (i2 == 2) {
                    if (this.startVersion != null) {
                        throw new UnsupportedFilterException("Multiple version matching is not supported");
                    }
                    this.startVersion = version;
                    this.startExclusive = false;
                    return;
                }
                if (i2 == 3) {
                    if (this.startVersion != null) {
                        throw new UnsupportedFilterException("Multiple version matching is not supported");
                    }
                    this.startVersion = version;
                    this.startExclusive = true;
                    return;
                }
                if (i2 == 4) {
                    if (this.endVersion != null) {
                        throw new UnsupportedFilterException("Multiple version matching is not supported");
                    }
                    this.endVersion = version;
                    this.endExclusive = false;
                    return;
                }
                if (i2 != 5) {
                    return;
                }
                if (this.endVersion != null) {
                    throw new UnsupportedFilterException("Multiple version matching is not supported");
                }
                this.endVersion = version;
                this.endExclusive = true;
                return;
            default:
                throw new UnsupportedFilterException("Unsupported attribute: " + leftValue);
        }
    }

    /* renamed from: org.apache.ivy.osgi.obr.xml.RequirementAdapter$1 */
    public static /* synthetic */ class C111841 {
        public static final /* synthetic */ int[] $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator;

        static {
            int[] iArr = new int[CompareFilter.Operator.values().length];
            $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator = iArr;
            try {
                iArr[CompareFilter.Operator.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[CompareFilter.Operator.GREATER_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[CompareFilter.Operator.GREATER_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[CompareFilter.Operator.LOWER_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$ivy$osgi$filter$CompareFilter$Operator[CompareFilter.Operator.LOWER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
