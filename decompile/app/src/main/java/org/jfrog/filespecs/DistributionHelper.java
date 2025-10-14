package org.jfrog.filespecs;

import java.util.ArrayList;
import java.util.List;
import org.jfrog.filespecs.aql.AqlConverter;
import org.jfrog.filespecs.distribution.DistributionSpecComponent;
import org.jfrog.filespecs.distribution.PathMapping;
import org.jfrog.filespecs.distribution.PathMappingGenerator;
import org.jfrog.filespecs.entities.FilesGroup;
import org.jfrog.filespecs.entities.InvalidFileSpecException;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class DistributionHelper {
    public static List<DistributionSpecComponent> toSpecComponents(FileSpec fileSpec) throws InvalidFileSpecException {
        FileSpecsValidation.validateSearchBasedFileSpec(fileSpec);
        ArrayList arrayList = new ArrayList();
        for (FilesGroup filesGroup : fileSpec.getFiles()) {
            String strConvertFilesGroupToAql = AqlConverter.convertFilesGroupToAql(filesGroup);
            ArrayList arrayList2 = new ArrayList();
            PathMapping pathMappingCreatePathMapping = PathMappingGenerator.createPathMapping(filesGroup);
            if (pathMappingCreatePathMapping != null) {
                arrayList2.add(pathMappingCreatePathMapping);
            }
            arrayList.add(new DistributionSpecComponent(strConvertFilesGroupToAql, arrayList2, PropertiesParser.parsePropertiesStringToList(filesGroup.getTargetProps())));
        }
        return arrayList;
    }
}
