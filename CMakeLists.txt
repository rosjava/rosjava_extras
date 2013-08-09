cmake_minimum_required(VERSION 2.8.3)
project(rosjava_extras)

find_package(catkin REQUIRED rosjava_core rosjava_tools)

catkin_rosjava_setup(install)

catkin_package()

