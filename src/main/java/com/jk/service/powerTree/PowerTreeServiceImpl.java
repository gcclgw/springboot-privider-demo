package com.jk.service.powerTree;

import com.jk.mapper.powerTree.PowerTreeMapper;
import com.jk.model.power.PowerTree;
import com.jk.utils.SessionUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.*;

@Service("powerTreeService")
public class PowerTreeServiceImpl implements PowerTreeService{


    @Autowired
    private PowerTreeMapper powerTreeMapper;


    /*@Override
    public List<PowerTree> getTreeNavCommon() {

      *//*  //获取用户id
        String userId = SessionUserUtil.getUserId(request);

        List<PowerTree> childrenList = powerTreeMapper.getUserPowerChildrenList(userId);*//*
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
    }*/




    /*@Override
    public List<PowerTree> getUserPowerChildrenList(String userId) {
        return powerTreeMapper.getUserPowerChildrenList(userId);
    }*/

    @Override
    public List<PowerTree> getNode(String id,String userId) {

        return  powerTreeMapper.getNode(id,userId);
    }

   /* @Override
    public List<PowerTree> getParent(Integer pid) {
        return powerTreeMapper.getParent(pid);
    }

    @Override
    public List<String> getUserPowerUrlListByUserId(String userId) {
        return powerTreeMapper.getUserPowerUrlListByUserId(userId);
    }*/

    /*@RequestMapping("getTreeNavCommon")
    @ResponseBody
    public List<PowerTree> selectPowerTree(HttpServletRequest request) {
        //获取用户id
        String userId = SessionUserUtil.getUserId(request);
        String cachekey = ConstantsConf.NAV_CACHE + userId;
        String navcaChe = redisTemplate.opsForValue().get(cachekey);
        if (null == navcaChe) {
            //查询出用户的权限的最子级的节点
            List<PowerTree> childrenList = powerTreeService.getUserPowerChildrenList(userId);
            //构建总返回集合
            ArrayList<PowerTree> result = new ArrayList<>();
            //所有节点放入到总返回集合中
            childrenList.forEach((s) -> {

                result.add(s);
            });
            //反递归查询出父级节点
            getParent(childrenList, result);
            //存放30分钟
            //redisTemplate.opsForValue().set(cachekey,JsonStringEncoder,30, TimeUnit.MINUTES);
            //返回结果集
            return result;
        } else {
            //将json数据转换为list集合数据
            List<PowerTree> parseArray = JSONArray.parseArray(navcaChe, PowerTree.class);
            return parseArray;
        }


    }

    private void getParent(List<PowerTree> childrenList, ArrayList<PowerTree> result) {
        for (PowerTree powerTree : childrenList) {
            result.add(powerTree);
            List<PowerTree> parent =powerTreeService.getParent(powerTree.getPid());
            if (parent != null) {
                powerTree.setLeaf(false);
                powerTree.setSelectable(false);
                powerTree.setChildren(parent);
                //result.add(parent);
                ArrayList<PowerTree> parents = new ArrayList<>();
                //parents.add(parent);
                getParent(parents, result);
            } else {
                powerTree.setSelectable(true);
                powerTree.setLeaf(true);
            }
        }

    }*/










}
