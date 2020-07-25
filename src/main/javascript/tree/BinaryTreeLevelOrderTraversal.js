/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
const levelOrder = function (root) {
    if (root == null)
        return [];

    const levels = [];
    traverse(root, 0, levels)

    return levels;
};

const traverse = (node, level, levels) => {

    if (node == undefined)
        return;

    if (levels.length === level) {
        levels.push([]);
    }

    levels[level].push(node.val);

    if (node.left !== undefined) {
        traverse(node.left, level+1, levels)
    }
    if (node.right !== undefined) {
        traverse(node.right, level+1, levels)
    }
}