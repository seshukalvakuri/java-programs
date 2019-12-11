
create or replace procedure update_total(SID number, total_Score number)

Is
BEGIN 
UPDATE  studentmarks set total_score = math_score+reading_score+writing_score where S_ID = SID;
dbms_output.put_line(total_score);
END;



