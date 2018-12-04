package edu.iot.common.dao;

import java.util.List;

import edu.iot.common.model.Attachment;

//delete가 두가지임 		1. attachmentId로 삭제 		2.boardId로 삭제
public interface AttachmentDao {
	void insert(Attachment attachment) throws Exception;
	List<Attachment> getList(long boardId) throws Exception;
	Attachment findById(long attachmentId) throws Exception;
	void delete(long attachmenId) throws Exception;
	void deleteByBoardId(long boardId) throws Exception;
}
