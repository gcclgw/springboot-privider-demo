package com.jk.service.powerTree;

import com.jk.mapper.powerTree.PowerTreeMapper;
import com.jk.model.power.PowerTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("powerTreeService")
public class PowerTreeServiceImpl implements PowerTreeService{


    @Autowired
    private PowerTreeMapper powerTreeMapper;

   /* @Override
    public List<PowerTree> getTreeNavCommon() {
        String id = "0";
        List<PowerTree> nodes = getNodes(id);
        return nodes;
    }

    private List<PowerTree> getNodes(String id){
        List<PowerTree> ListNodes = powerTreeMapper.getNodes(id);

        for (PowerTree nav : ListNodes) {

            List<PowerTree> nodes = getNodes(nav.getId());

            if(nodes != null && nodes.size() > 0) {

                nav.setLeaf(false);
                nav.setSelectable(false);
                nav.setNodes(nodes);

            }else {

                nav.setLeaf(true);
                nav.setSelectable(true);

            }


        }

        return ListNodes;

    }*/



    @Override
    public List<PowerTree> getTreeNavCommon() {
        String id = "0";
        List<PowerTree> node = getNode(id);
        return node;
    }

    private List<PowerTree> getNode(String id) {
        List<PowerTree> trees = powerTreeMapper.getNode(id);
            for (PowerTree tree:trees){
                List<PowerTree> node = getNode(tree.getId());
                if (node != null && node.size() > 0){
                    tree.setLeaf(false);
                    tree.setSelectable(false);
                    tree.setNodes(node);
                }else {
                    tree.setLeaf(true);
                    tree.setSelectable(true);
                }
            }
            return  trees;
    }

    /*@Override
    public List<PowerTree> getUserPowerChildrenList(String userId) {
        return powerTreeMapper.getUserPowerChildrenList(userId);
    }

    @Override
    public List<PowerTree> getParent(Integer pid) {
        return powerTreeMapper.getParent(pid);
    }

    @Override
    public List<String> getUserPowerUrlListByUserId(String userId) {
        return powerTreeMapper.getUserPowerUrlListByUserId(userId);
    }*/

}
