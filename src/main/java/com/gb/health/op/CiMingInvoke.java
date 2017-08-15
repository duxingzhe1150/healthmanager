package com.gb.health.op;

import com.gb.health.domain.*;
import com.gb.health.utils.DateTransfer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class CiMingInvoke {

    private ReportPersonnel personnel=new ReportPersonnel();

    private List<ReportDepartment> departments=new ArrayList<>();

    private List<ReportGeneral> generals=new ArrayList<>();

    private List<ReportPooled> pooleds;

    private static Set<String> generalGroup;

    static {
        generalGroup=new HashSet<>();

        generalGroup.add("Hemorheology");
        generalGroup.add("ThyroidFunction");
        generalGroup.add("Urinalysis");
        generalGroup.add("Tumor");
        generalGroup.add("BiochemicalDetection");
        generalGroup.add("CBC");
        generalGroup.add("GeneralInspection");

    }


    /**
     *
     * @param ciMing
     */
    public void invoke(CiMing ciMing){

        setPersonnel(ciMing);

        try {
            Field[] fields=ciMing.getClass().getFields();

            for (int i = 0; i < fields.length; i++) {

                Object o=fields[i].get(ciMing);

                if (o==null || o.getClass().getSimpleName().equals("Baseinfo")){
                    System.out.println("-----------------");
                    continue;
                }
                setData(o);


            }
        }catch (Exception e){

            e.printStackTrace();
        }
    }


    protected void setData(Object o) throws InvocationTargetException, IllegalAccessException {

        Field[] fields1=o.getClass().getDeclaredFields();

        Method[] methods= o.getClass().getMethods();

        o.getClass().getMethods();

        System.out.println(o.getClass().getSimpleName());
        System.out.println(fields1.length);

        if (generalGroup.contains(o.getClass().getSimpleName())){

            ReportGeneral general=new ReportGeneral();

            int length=methods.length/3;

//            System.out.println("methods:"+methods.length);
//            System.out.println(Arrays.toString(methods));

            for (int k = 0; k < length; k++) {
//                System.out.println(methods[k].getName()+":"+k);
                if (methods[k].getName().startsWith("get") && !methods[k].getName().endsWith("Class")){
                    String key=methods[k].getName().substring(3);
                    general.setgType(o.getClass().getSimpleName());

                    if (!key.endsWith("_scope") && !key.endsWith("_unit")){
                        general.setgItem(key);
                        System.out.println(methods[k].getName());
                        general.setgResult(methods[k].invoke(o)+"");

//                        System.out.println(findUnitOrScope(methods,methods[k].getName()+"_unit").getName());

                        String unit=findUnitOrScope(methods,methods[k].getName()+"_unit").invoke(o)+"";
                        general.setgUnits(unit);

                        String scope=findUnitOrScope(methods,methods[k].getName()+"_scope").invoke(o)+"";
                        general.setgRange(scope);
                        generals.add(general);
                        general=new ReportGeneral();
                    }

//                    int temp=k+length;
//                    general.setgUnits(methods[temp].invoke(o)+"");
//                    general.setgRange(methods[temp++].invoke(o)+"");


                }
            }

        }else {

            for (int k = 0; k < methods.length; k++) {
                ReportDepartment department=new ReportDepartment();
                if (methods[k].getName().startsWith("get")&& !methods[k].getName().endsWith("Class")){
                    String key=methods[k].getName().substring(3);

                    department.setdDepartment(o.getClass().getSimpleName());
                    department.setdItem(key);
                    department.setdResult(methods[k].invoke(o)+"");

                    departments.add(department);
                }
            }


        }

    }


    private Method findUnitOrScope(Method[] methods,String key){

        for (int i = 0; i <methods.length ; i++) {

            if (key.equals(methods[i].getName()))
                return methods[i];
        }


        return null;
    }

    public ReportPersonnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(CiMing ciMing) {

        this.personnel.setpName(ciMing.baseinfo.getB_name());
        this.personnel.setpAge(Integer.parseInt(ciMing.baseinfo.getB_age()));
        this.personnel.setpAddr(ciMing.baseinfo.getB_MailingAddress());
        this.personnel.setpBirth(DateTransfer.stringToDateNoTime(ciMing.baseinfo.getB_birthday()));
        this.personnel.setpCompany(ciMing.baseinfo.getB_WorkUnit());
        this.personnel.setpEmail(ciMing.baseinfo.getB_Email());
        this.personnel.setpHomeTel(ciMing.baseinfo.getB_HomePhone());
        this.personnel.setpIdcard(ciMing.baseinfo.getB_personid());
        this.personnel.setpMarriage(ciMing.baseinfo.getB_marriage());
        this.personnel.setpNation(ciMing.baseinfo.getB_country());
        this.personnel.setpNationality(ciMing.baseinfo.getB_nationality());
        this.personnel.setpOfficeTel(ciMing.baseinfo.getB_OfficeTelephone());
        this.personnel.setpTel(ciMing.baseinfo.getB_tel());
        this.personnel.setpSex(ciMing.baseinfo.getB_sex());

    }

    public List<ReportDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<ReportDepartment> departments) {
        this.departments = departments;
    }

    public List<ReportGeneral> getGenerals() {
        return generals;
    }

    public void setGenerals(List<ReportGeneral> generals) {
        this.generals = generals;
    }

    public List<ReportPooled> getPooleds() {
        return pooleds;
    }

    public void setPooleds(List<ReportPooled> pooleds) {
        this.pooleds = pooleds;
    }
}
