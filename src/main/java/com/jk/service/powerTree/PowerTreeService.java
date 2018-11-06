package com.jk.service.powerTree;

import com.jk.model.power.PowerTree;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public interface PowerTreeService {

    /*List<PowerTree> getUserPowerChildrenList(String userId);*/

   /* List<PowerTree> getParent(Integer pid);

    List<String> getUserPowerUrlListByUserId(String userId);*/

    /*List<PowerTree> getTreeNavCommon();*/

    List<PowerTree> getNode(String id,String userId);


}
