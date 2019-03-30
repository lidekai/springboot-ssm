/*
 Navicat Premium Data Transfer

 Source Server         : oracle
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : localhost:1521
 Source Schema         : SSM

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 30/03/2019 19:12:33
*/


-- ----------------------------
-- Table structure for TEST
-- ----------------------------
DROP TABLE "SSM"."TEST";
CREATE TABLE "SSM"."TEST" (
  "testID" VARCHAR2(10 BYTE) NOT NULL ,
  "testName" VARCHAR2(20 BYTE) ,
  "testSex" VARCHAR2(20 BYTE) ,
  "testAge" VARCHAR2(10 BYTE) ,
  "testDate" TIMESTAMP(6) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TEST
-- ----------------------------
INSERT INTO "SSM"."TEST" VALUES ('1', '1', '1', '1', TO_TIMESTAMP('2019-03-27 21:28:34.566000', 'SYYYY-MM-DD HH24:MI:SS:FF6'));
INSERT INTO "SSM"."TEST" VALUES ('2', '2', '2', '2', TO_TIMESTAMP('2019-03-27 21:28:40.495000', 'SYYYY-MM-DD HH24:MI:SS:FF6'));
INSERT INTO "SSM"."TEST" VALUES ('3', '3', '3', '3', TO_TIMESTAMP('2019-03-20 21:28:43.233000', 'SYYYY-MM-DD HH24:MI:SS:FF6'));

-- ----------------------------
-- Checks structure for table TEST
-- ----------------------------
ALTER TABLE "SSM"."TEST" ADD CONSTRAINT "SYS_C0011049" CHECK ("testID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SSM"."TEST" ADD CONSTRAINT "SYS_C0011050" CHECK ("testID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SSM"."TEST" ADD CONSTRAINT "SYS_C0011053" CHECK ("testID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
