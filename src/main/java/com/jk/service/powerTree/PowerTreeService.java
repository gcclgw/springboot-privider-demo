package com.jk.service.powerTree;

import com.jk.model.power.PowerTree;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public interface PowerTreeService {

   /* List<PowerTree> getUserPowerChildrenList(String userId);

    List<PowerTree> getParent(Integer pid);

    List<String> getUserPowerUrlListByUserId(String userId);*/

    List<PowerTree> getTreeNavCommon();


}
