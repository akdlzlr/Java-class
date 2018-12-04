package edu.iot.common.dao;

import java.util.List;
import java.util.Map;

import edu.iot.common.model.Plan;

public interface PlanDao extends CrudDao<Plan, Long> {
	List<Plan> getList(String userId) throws Exception;
}
