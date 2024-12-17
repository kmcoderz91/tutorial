# File System
## Core Features
* Storage Abstraction : Simulates a disk or memory block.
* File Abstraction : Represents files with metadata (e.g., name, size, permissions).
* Directory Structure : Hierarchical organization (like a tree).
* File Operations : Create, Read, Write, Delete, and Rename.
* Directory Operations : List contents, create subdirectories, delete directories.
* Access Control : Permissions for read/write/execute.

## Class Diagram
* FileSystem : The main orchestrator.
* Storage : Simulates disk or block-level storage.
* File : Represents individual files.
* Directory : Represents directories, containing files or other directories.
* INode : A generic abstraction for both files and directories.
* PathResolver : Helps resolve absolute or relative paths.
* FileSystemException : Handles errors.

## Extension
* Access Control
* Storage Management
* File Content
* Disk Serialization
* Links and Shortcuts
* Concurrency
* Caching