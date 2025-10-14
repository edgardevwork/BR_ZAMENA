package org.jfrog.filespecs.aql;

import org.jfrog.filespecs.entities.FilesGroup;
import org.jfrog.filespecs.entities.InvalidFileSpecException;

/* loaded from: classes5.dex */
public class AqlConverter {

    /* renamed from: org.jfrog.filespecs.aql.AqlConverter$1 */
    public static /* synthetic */ class C113031 {
        public static final /* synthetic */ int[] $SwitchMap$org$jfrog$filespecs$entities$FilesGroup$SpecType;

        static {
            int[] iArr = new int[FilesGroup.SpecType.values().length];
            $SwitchMap$org$jfrog$filespecs$entities$FilesGroup$SpecType = iArr;
            try {
                iArr[FilesGroup.SpecType.PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jfrog$filespecs$entities$FilesGroup$SpecType[FilesGroup.SpecType.AQL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String convertFilesGroupToAql(FilesGroup filesGroup) throws InvalidFileSpecException {
        String strConvertPatternFileSpecToAql;
        int i = C113031.$SwitchMap$org$jfrog$filespecs$entities$FilesGroup$SpecType[filesGroup.getSpecType().ordinal()];
        if (i == 1) {
            strConvertPatternFileSpecToAql = convertPatternFileSpecToAql(filesGroup);
        } else if (i == 2) {
            strConvertPatternFileSpecToAql = filesGroup.getAql();
        } else {
            throw new InvalidFileSpecException("The files group must have either pattern or aql filled to be converted to AQL.");
        }
        String strBuildQuerySuffix = AqlBuildingUtils.buildQuerySuffix(filesGroup.getSortBy(), filesGroup.getSortOrder(), filesGroup.getOffset(), filesGroup.getLimit());
        return String.format("items.find(%s)%s%s", strConvertPatternFileSpecToAql, AqlBuildingUtils.buildIncludeQueryPart(filesGroup.getSortBy(), strBuildQuerySuffix), strBuildQuerySuffix);
    }

    public static String convertPatternFileSpecToAql(FilesGroup filesGroup) {
        return AqlBuildingUtils.buildAqlSearchQuery(filesGroup.getPattern(), filesGroup.getExclusions(), filesGroup.getExcludePatterns(), !"false".equalsIgnoreCase(filesGroup.getRecursive()), filesGroup.getProps());
    }
}
